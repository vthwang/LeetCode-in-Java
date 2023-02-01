# [1071. Greatest Common Divisor of Strings](https://leetcode.com/problems/greatest-common-divisor-of-strings/)

For two strings `s` and `t`, we say " `t` divides `s`" if and only if `s = t + ... + t` (i.e., `t` is concatenated with itself one or more times).

Given two strings `str1` and `str2`, return _the largest string_ `x` _such that_ `x` _divides both_ `str1` _and_ `str2`.

**Example 1:**

```
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
```

**Example 2:**

```
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
```

**Example 3:**

```
Input: str1 = "LEET", str2 = "CODE"
Output: ""
```

## Solutions
### [Brute Force](GreatestCommonDivisorOfStrings.java)

Idea: We can iterate all possible prefixes to find the answer.

```java
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length(), n2 = str2.length();
        for (int i = Math.min(n1, n2); i >= 1; i--) {
            String x = str1.substring(0, i);
            if (check(x, str1) && check(x, str2))
                return x;
        }
        return "";
    }

    private boolean check(String t, String s) {
        int n = s.length() / t.length();
        return t.repeat(n).equals(s);
    }
}
```

Complexity Analysis:

- Time Complexity: $O(gcd(n_1,n_2)\times(n_1+n_2))$. $n_1$ is the length of `str1` and $n_2$ is the length of `str2`. $gcd(n_1,n_2)$ is the amount of greatest common divisor and we need to check with $n_1+n_2$ times.
- Space Complexity: $O(n_1+n_2)$. When we check the string, we need to generate the strings with $n_1$ and $n_2$ length.

### [Math](GreatestCommonDivisorOfStrings2.java)

Idea: We can iterate all possible prefixes to find the answer.

```java
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!str1.concat(str2).equals(str2.concat(str1)))
            return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int a, int b) {
        int remainder = a % b;
        while (remainder != 0) {
            a = b;
            b = remainder;
            remainder = a % b;
        }
        return b;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `str1` + `str2`. Concatenate string costs $O(n)$ and find two strings greatest common divisor costs $O(\log n)$. Thus, the total time complexity is $O(n)$.
- Space Complexity: $O(n)$. `concat` function use a temp to save the result of combining `str1` and `str2`.
