# [1207. Unique Number of Occurrences](https://leetcode.com/problems/unique-number-of-occurrences/)

Given an array of integers `arr`, return `true` if the number of occurrences of each value in the array is **unique**, or `false` otherwise.

**Example 1:**

```
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
```

**Example 2:**

```
Input: arr = [1,2]
Output: false
```

**Example 3:**

```
Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
```

## Solutions
### [Array](./UniqueNumberOfOccurrences.java)

Idea: Since the number range is limited from -1000 to 1000. We can define an array with size 2001 to save all elements’ frequency. Then iterate through all elements and check if the same frequency exists.

```java
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i] + 1000]++;
        }
        Arrays.sort(freq);

        for (int i = 0; i < 2000; i++) {
            if (freq[i] != 0 && freq[i] == freq[i + 1])
                return false;
        }
        return true;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. Iterate all elements and save to frequency array is $O(n)$. Suppose the limitation of number range is $2k$. Sort operation is $O(2k\log^{2k})$. Thus, the total time complexity is $O(n+k\log^k)$ which $n$ is the input length and $k=1000$.
- Space Complexity: $O(k)$. The frequency array is $O(2k)$.
