# [520. Detect Capital](https://leetcode.com/problems/detect-capital/)

We define the usage of capitals in a word to be right when one of the following cases holds:

- All letters in this word are capitals, like `"USA"`.
- All letters in this word are not capitals, like `"leetcode"`.
- Only the first letter in this word is capital, like `"Google"`.

Given a string `word`, return `true` if the usage of capitals in it is right.

**Example 1:**

```
Input: word = "USA"
Output: true
```

**Example 2:**

```
Input: word = "FlaG"
Output: false
```

## Solutions
### [String](DetectCapital.java)

Idea: We first check the second case, if the first letter is lower case, but the second letter is upper case, it’s not capital. For the rest of letters, if they have different case with the second letter, it’s not capital as well.

```java
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() >= 2 && Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1)))
            return false;
        
        for (int i = 2; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)) ^ Character.isLowerCase(word.charAt(1)))
                return false;
        }
        
        return true;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of word.
- Space Complexity: $O(1)$.
