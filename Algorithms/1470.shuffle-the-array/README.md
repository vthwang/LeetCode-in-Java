# [1470. Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)

Given the array `nums` consisting of `2n` elements in the form `[x<sub>1</sub>,x<sub>2</sub>,...,x<sub>n</sub>,y<sub>1</sub>,y<sub>2</sub>,...,y<sub>n</sub>]`.

_Return the array in the form_ `[x<sub>1</sub>,y<sub>1</sub>,x<sub>2</sub>,y<sub>2</sub>,...,x<sub>n</sub>,y<sub>n</sub>]`.

**Example 1:**

```
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x<sub>1</sub>=2, x<sub>2</sub>=5, x<sub>3</sub>=1, y<sub>1</sub>=3, y<sub>2</sub>=4, y<sub>3</sub>=7 then the answer is [2,3,5,4,1,7].
```

**Example 2:**

```
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
```

**Example 3:**

```
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
```

## Solutions
### [Iteration](ShuffleTheArray.java)

Idea: According to the question, we need to put `nums[i]` to `res[2 * i]` and put `nums[i + n]` to `res[2 * i + 1]`.

```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[i + n];
        }
        return res;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. The iteration cost $O(n)$.
- Space Complexity: $O(1)$.
