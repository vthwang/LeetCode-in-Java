# [39. Combination Sum](https://leetcode.com/problems/combination-sum/)

Given an array of **distinct** integers `candidates` and a target integer `target`, return _a list of all **unique combinations** of_ `candidates` _where the chosen numbers sum to_ `target` _._ You may return the combinations in **any order**.

The **same** number may be chosen from `candidates` an **unlimited number of times**. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to `target` is less than `150` combinations for the given input.

**Example 1:**

```
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
```

**Example 2:**

```
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
```

**Example 3:**

```
Input: candidates = [2], target = 1
Output: []
```

## Solutions
### [Backtracking](./CombinationSum.java)

Idea: we can define a recursion function called `dfs(target, combine, idx)` to represent how many target do we have, the number are selected in list `combine` and the current position `idx` in candidates. The basic case is target ≤ 0 or candidates are running out.

```java
class Solution {
    private void dfs(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combine, int idx) {
        if (candidates.length == idx)
            return;
        if (target == 0) {
            ans.add(new ArrayList<>(combine));
            return;
        }
        dfs(candidates, target, ans, combine, idx + 1);
        // choose current number
        if (target - candidates[idx] >= 0) {
            combine.add(candidates[idx]);
            dfs(candidates, target - candidates[idx], ans, combine, idx);
            combine.remove(combine.size() - 1);
        }
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combine = new ArrayList<>();
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(S)$. $S$ is the sum of all possible solution. The recursion decides to select the number or not, the upper bound is $O(n \times 2^n)$. The solution is much more faster than this complexity, because it has many conditions and it’s not possible to run all of possibilities. Thus, the time complexity is $O(S)$.
- Space Complexity: $O(target)$. The space complexity depends on recursion’s depth, so the worst scenario needs to recurse for target levels.
