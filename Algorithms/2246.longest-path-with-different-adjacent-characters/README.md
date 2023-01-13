# [2246. Longest Path With Different Adjacent Characters](https://leetcode.com/problems/longest-path-with-different-adjacent-characters/)

You are given a **tree** (i.e. a connected, undirected graph that has no cycles) **rooted** at node `0` consisting of `n` nodes numbered from `0` to `n - 1`. The tree is represented by a **0-indexed** array `parent` of size `n`, where `parent[i]` is the parent of node `i`. Since node `0` is the root, `parent[0] == -1`.

You are also given a string `s` of length `n`, where `s[i]` is the character assigned to node `i`.

Return _the length of the **longest path** in the tree such that no pair of **adjacent** nodes on the path have the same character assigned to them._

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/03/25/testingdrawio.png)

```
Input: parent = [-1,0,0,1,1,2], s = "abacbe"
Output: 3
Explanation: The longest path where each two adjacent nodes have different characters in the tree is the path: 0 -> 1 -> 3. The length of this path is 3, so 3 is returned.
It can be proven that there is no longer path that satisfies the conditions.
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/03/25/graph2drawio.png)

```
Input: parent = [-1,0,0,0], s = "aabc"
Output: 3
Explanation: The longest path where each two adjacent nodes have different characters is the path: 2 -> 0 -> 3. The length of this path is 3, so 3 is returned.
```

## Solutions
### [DFS](LongestPathWithDifferentAdjacentCharacters.java)

Idea: If we want to find the longest path from the rooted tree, we can divide the longest path into two longest paths from children.

```java
class Solution {
    private int longestPath = 1;

    public int longestPath(int[] parent, String s) {
        int n = parent.length;
        Map<Integer, List<Integer>> children = new HashMap<>();
        for (int i = 1; i < n; i++)
            children.computeIfAbsent(parent[i], value -> new ArrayList<>()).add(i);
        dfs(0, children, s);

        return longestPath;
    }

    private int dfs(int currentNode, Map<Integer, List<Integer>> children, String s) {
        if (!children.containsKey(currentNode))
            return 1;

        int longestChain = 0, secondLongestChain = 0;
        for (int child : children.get(currentNode)) {
            int longestChainStartingFromChild = dfs(child, children, s);
            if (s.charAt(currentNode) == s.charAt(child))
                continue;
            if (longestChainStartingFromChild > longestChain) {
                secondLongestChain = longestChain;
                longestChain = longestChainStartingFromChild;
            } else if (longestChainStartingFromChild > secondLongestChain)
                secondLongestChain = longestChainStartingFromChild;
        }

        longestPath = Math.max(longestPath, longestChain + secondLongestChain + 1);
        return longestChain + 1;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. Using DFS to iterate all nodes, the time complexity is $O(n)$ and generate children array is $O(n)$ as well. The total time complexity is $O(2n)=O(n)$.
- Space Complexity: $O(n)$. DFS calls stack with the most $n$ elements and children array costs $O(n)$ space as well. The total space complexity is $O(2n)=O(n)$.
