# [290. Word Pattern](https://leetcode.com/problems/word-pattern/)

Given a `pattern` and a string `s`, find if `s` follows the same pattern.

Here **follow** means a full match, such that there is a bijection between a letter in `pattern` and a **non-empty** word in `s`.

**Example 1:**

```
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
```

**Example 2:**

```
Input: pattern = "abba", s = "dog cat cat fish"
Output: false
```

**Example 3:**

```
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
```

## Solutions
### [Hash Map](WordPattern.java)

Idea: We store the characters and strings into two hash maps to make sure they are in one-to-one relationship.

```java
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String, Character> str2ch = new HashMap<>();
        Map<Character, String> ch2str = new HashMap<>();
        int n = s.length(), i = 0;
        for (int p = 0; p < pattern.length(); p++) {
            char currentPattern = pattern.charAt(p);
            if (i >= n) return false;
            int j = i;
            while (j < n && s.charAt(j) != ' ') {
                j++;
            }
            String word = s.substring(i, j);
            if (str2ch.containsKey(word) && str2ch.get(word) != currentPattern)
                return false;
            if (ch2str.containsKey(currentPattern) && !word.equals(ch2str.get(currentPattern)))
                return false;
            str2ch.put(word, currentPattern);
            ch2str.put(currentPattern, word);
            i = j + 1;
        }
        return i >= n;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+m)$. $n$ is the length of s and $m$ is the length of pattern. Each character is only traverse at most once.
- Space Complexity: $O(n+m)$. The size of two maps is $n$ and $m$ respectively.
