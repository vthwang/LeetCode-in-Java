# [989. Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)

The **array-form** of an integer `num` is an array representing its digits in left to right order.

- For example, for `num = 1321`, the array form is `[1,3,2,1]`.

Given `num`, the **array-form** of an integer, and an integer `k`, return _the **array-form** of the integer_ `num + k`.

**Example 1:**

```
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
```

**Example 2:**

```
Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
```

**Example 3:**

```
Input: num = [2,1,5], k = 806
Output: [1,0,2,1]
Explanation: 215 + 806 = 1021
```

## Solutions
### [Array](AddToArrayFormOfInteger.java)

Idea: We can simply add k to the last number of num array, and leave one digit which is remainder of 10 to the answer list.

```java
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = num.length - 1; i >= 0 || k > 0; i--, k /= 10) {
            if (i >= 0)
                k += num[i];
            ans.add(k % 10);
        }
        Collections.reverse(ans);
        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(\max(n,\log k))$. $n$ is the length of `num`.
- Space Complexity: $O(1)$.
