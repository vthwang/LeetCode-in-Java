# [443. String Compression](https://leetcode.com/problems/string-compression/)

Given an array of characters `chars`, compress it using the following algorithm:

Begin with an empty string `s`. For each group of **consecutive repeating characters** in `chars`:

- If the group's length is `1`, append the character to `s`.
- Otherwise, append the character followed by the group's length.

The compressed string `s` **should not be returned separately**, but instead, be stored **in the input character array `chars`**. Note that group lengths that are `10` or longer will be split into multiple characters in `chars`.

After you are done **modifying the input array,** return _the new length of the array_.

You must write an algorithm that uses only constant extra space.

**Example 1:**

```
Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
```

**Example 2:**

```
Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
```

**Example 3:**

```
Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
```

## Solutions
### [Two Pointers](StringCompression.java)

Idea: We use two pointers to compress the chars. When we found the different letters or the char is the last char, we can compress them into numbers.

```java
class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0, left = 0;
        for (int read = 0; read < n; read++) {
            if (read == n - 1 || chars[read] != chars[read + 1]) {
                chars[write++] = chars[read];
                int cnt = read - left + 1;
                if (cnt > 1) {
                    String str = String.valueOf(cnt);
                    for (int i = 0; i < str.length(); i++) {
                        chars[write++] = str.charAt(i);
                    }
                }
                left = read + 1;
            }
        }
        return write;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of `chars`.
- Space Complexity: $O(1)$.
