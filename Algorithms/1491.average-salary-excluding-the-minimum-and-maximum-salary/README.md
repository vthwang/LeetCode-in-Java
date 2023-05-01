# [1491. Average Salary Excluding the Minimum and Maximum Salary](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/)

You are given an array of **unique** integers `salary` where `salary[i]` is the salary of the `i<sup>th</sup>` employee.

Return _the average salary of employees excluding the minimum and maximum salary_. Answers within `10<sup>-5</sup>` of the actual answer will be accepted.

**Example 1:**

```
Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
```

**Example 2:**

```
Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
```

## Solutions
### [Array](AverageSalaryExcludingTheMinimumAndMaximumSalary.java)

Idea: Iterate all salary and find max and min, then remove them and find the average.

```java
class Solution {
    public double average(int[] salary) {
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        double sum = 0, count = salary.length - 2;
        for (int s: salary) {
            if (s > max) {
                max = s;
            }
            if (s < min) {
                min = s;
            }
            sum += s;
        }
        return (sum - min - max) / count;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `salary`.
- Space Complexity: $O(1)$.
