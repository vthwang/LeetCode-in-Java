# [1061. Lexicographically Smallest Equivalent String](https://leetcode.com/problems/lexicographically-smallest-equivalent-string/)

You are given two strings of the same length `s1` and `s2` and a string `baseStr`.

We say `s1[i]` and `s2[i]` are equivalent characters.

- For example, if `s1 = "abc"` and `s2 = "cde"`, then we have `'a' == 'c'`, `'b' == 'd'`, and `'c' == 'e'`.

Equivalent characters follow the usual rules of any equivalence relation:

- **Reflexivity:** `'a' == 'a'`.
- **Symmetry:** `'a' == 'b'` implies `'b' == 'a'`.
- **Transitivity:** `'a' == 'b'` and `'b' == 'c'` implies `'a' == 'c'`.

For example, given the equivalency information from `s1 = "abc"` and `s2 = "cde"`, `"acd"` and `"aab"` are equivalent strings of `baseStr = "eed"`, and `"aab"` is the lexicographically smallest equivalent string of `baseStr`.

Return _the lexicographically smallest equivalent string of_ `baseStr` _by using the equivalency information from_ `s1` _and_ `s2`.

**Example 1:**

```
Input: s1 = "parker", s2 = "morris", baseStr = "parser"
Output: "makkek"
Explanation: Based on the equivalency information in s1 and s2, we can group their characters as [m,p], [a,o], [k,r,s], [e,i].
The characters in each group are equivalent and sorted in lexicographical order.
So the answer is "makkek".
```

**Example 2:**

```
Input: s1 = "hello", s2 = "world", baseStr = "hold"
Output: "hdld"
Explanation: Based on the equivalency information in s1 and s2, we can group their characters as [h,w], [d,e,o], [l,r].
So only the second letter 'o' in baseStr is changed to 'd', the answer is "hdld".
```

**Example 3:**

```
Input: s1 = "leetcode", s2 = "programs", baseStr = "sourcecode"
Output: "aauaaaaada"
Explanation: We group the equivalent characters in s1 and s2 as [a,o,e,r,s,c], [l,p], [g,t] and [d,m], thus all letters in baseStr except 'u' and 'd' are transformed to 'a', the answer is "aauaaaaada".
```

## Solutions
### [DFS](LexicographicallySmallestEquivalentString.java)

Idea: We use DFS to get the chain of characters, and replace every characters in the baseStr with the minimum character in the chain.

```java
class Solution {
    int minChar;

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[][] adjMatrix = new int[26][26];
        for (int i = 0; i < s1.length(); i++) {
            adjMatrix[s1.charAt(i) - 'a'][s2.charAt(i) - 'a'] = 1;
            adjMatrix[s2.charAt(i) - 'a'][s1.charAt(i) - 'a'] = 1;
        }

        int[] mappingChar = new int[26];
        for (int i = 0; i < 26; i++)
            mappingChar[i] = i;

        boolean[] visited = new boolean[26];
        for (int c = 0; c < 26; c++) {
            if (!visited[c]) {
                List<Integer> component = new ArrayList<>();
                minChar = 27;
                dfs(c, adjMatrix, visited, component);
                for (int vertex : component)
                    mappingChar[vertex] = minChar;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c : baseStr.toCharArray())
            ans.append((char) (mappingChar[c - 'a'] + 'a'));

        return ans.toString();
    }

    private void dfs(int src, int[][] adjMatrix, boolean[] visited, List<Integer> component) {
        visited[src] = true;
        component.add(src);
        minChar = Math.min(minChar, src);

        for (int i = 0; i < 26; i++) {
            if (adjMatrix[src][i] != 0 && !visited[i])
                dfs(i, adjMatrix, visited, component);
        }
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+m+|\Sigma|^2)$. $n$ is the length of str1 and str2 and $m$ is the length of baseStr. Also, $|\Sigma|$ is the number of unique characters. The total time complexity is $O(n+m+|\Sigma|^2)$.
- Space Complexity: $O(|\Sigma|^2)$. The DFS recursion costs $O(|\Sigma|^2)$ in maximum.
