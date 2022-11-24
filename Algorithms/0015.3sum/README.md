# [15. 3Sum](https://leetcode.com/problems/3sum/)

Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

**Example 1:**

```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
```

**Example 2:**

```
Input: nums = []
Output: []
```

**Example 3:**

```
Input: nums = [0]
Output: []
```

**Constraints:**

- `0 <= nums.length <= 3000`
- `-10^5 <= nums[i] <= 10^5`

## Solutions
### [Sort + Two Pointers](./ThreeSum.java)

Idea: First, we sorted the numbers in array. Second, we iterate all elements in array and set the most left number to be the first number as one element of three numbers, then use two pointers to find the rest of two numbers equals to 0.

```java
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        
        // we only want to find three numbers, so we just need to find length - 2 numbers.
        for (int first = 0; first < n - 2; first++) {
            // remove duplicates
            if (first > 0 && nums[first] == nums[first - 1])
                continue;
            
            int second = first + 1;
            int third = n - 1;
            while (second < third) {
                int threeSum = nums[first] + nums[second] + nums[third];
                if (threeSum < 0)
                    second++;
                else if (threeSum > 0)
                    third--;
                else {
                    ans.add(Arrays.asList(nums[first], nums[second], nums[third]));
                    // remove duplicates in two pointers
                    while (second < third && nums[second] == nums[second + 1])
                        second++;
                    while (second < third && nums[third] == nums[third - 1])
                        third--;
                    second++;
                    third--;
                }
            }
        }
        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n^2)$. Sort’s time complexity is $O(n\log^n)$ and the iteration with two pointers is $O(n^2)$, so the total time complexity is $O(n^2)$.
- Space Complexity: $O(n)$. $n$ is the length of nums. We use an extra ArrayList with complexity $O(3(n-2))$ to save the answer.
