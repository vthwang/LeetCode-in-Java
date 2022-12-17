# [739. Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)

Given an array of integers `temperatures` represents the daily temperatures, return _an array_ `answer` _such that_ `answer[i]` _is the number of days you have to wait after the_ `i<sup>th</sup>` _day to get a warmer temperature_. If there is no future day for which this is possible, keep `answer[i] == 0` instead.

**Example 1:**

```
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
```

**Example 2:**

```
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
```

**Example 3:**

```
Input: temperatures = [30,60,90]
Output: [1,1,0]
```

## Solutions
### [Monotonic Stack](DailyTemperatures.java)

Idea: We will save the temperatures into stack with descending order. (That’s the reason why it’s called monotonic stack.) Since the monotonic stack satisfies the decreasing temperature corresponding to the elements from the bottom to the top of the stack, each time an element enters the stack, all elements with lower temperatures are removed and the number of waiting days corresponding to the outgoing elements is updated, which ensures that the number of waiting days must be the minimum.

```java
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int preIndex = stack.pop();
                ans[preIndex] = i - preIndex;
            }
            stack.push(i);
        }
        return ans;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of temperatures.
- Space Complexity: $O(n)$. We use stack to $n$ elements.
