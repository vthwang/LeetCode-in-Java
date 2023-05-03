# [2215. Find the Difference of Two Arrays](https://leetcode.com/problems/find-the-difference-of-two-arrays/)

Given two **0-indexed** integer arrays `nums1` and `nums2`, return _a list_ `answer` _of size_ `2` _where:_

- `answer[0]` _is a list of all **distinct** integers in_ `nums1` _which are **not** present in_ `nums2` _._
- `answer[1]` _is a list of all **distinct** integers in_ `nums2` _which are **not** present in_ `nums1`.

**Note** that the integers in the lists may be returned in **any** order.

**Example 1:**

```
Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
```

**Example 2:**

```
Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
```

## Solutions
### [Hash Set](FindTheDifferenceOfTwoArrays.java)

Idea: Put data into set, and then iterate the sets to find the differences.

```java
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num: nums1) {
            set1.add(num);
        }
        for (int num: nums2) {
            set2.add(num);
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();
        for (int num: set1) {
            if (!set2.contains(num)) {
                answer1.add(num);
            }
        }
        List<Integer> answer2 = new ArrayList<>();
        for (int num: set2) {
            if (!set1.contains(num)) {
                answer2.add(num);
            }
        }
        res.add(answer1);
        res.add(answer2);
        return res;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+m)$. $n$ is the length of `nums1` and $m$ is the length of `nums2`.
- Space Complexity: $O(n+m)$.
