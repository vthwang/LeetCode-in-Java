# [1704. Determine if String Halves Are Alike](https://leetcode.com/problems/determine-if-string-halves-are-alike/)

You are given a string `s` of even length. Split this string into two halves of equal lengths, and let `a` be the first half and `b` be the second half.

Two strings are **alike** if they have the same number of vowels ( `'a'`, `'e'`, `'i'`, `'o'`, `'u'`, `'A'`, `'E'`, `'I'`, `'O'`, `'U'`). Notice that `s` contains uppercase and lowercase letters.

Return `true` _if_ `a` _and_ `b` _are **alike**_. Otherwise, return `false`.

**Example 1:**

```
Input: s = "book"
Output: true
Explanation: a = "b<u>o</u>" and b = "<u>o</u>k". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
```

**Example 2:**

```
Input: s = "textbook"
Output: false
Explanation: a = "t<u>e</u>xt" and b = "b<u>oo</u>k". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
```

## Solutions
### [Counting](./DetermineIfStringHalvesAreAlike.java)

Idea: We just need to count the number of vowels.

```java
class Solution {
    public boolean halvesAreAlike(String s) {
        String left = s.substring(0, s.length() / 2);
        String right = s.substring(s.length() / 2);
        String v = "aeiouAEIOU";
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < left.length(); i++)
            if (v.indexOf(left.charAt(i)) >= 0)
                leftSum++;
        for (int i = 0; i < right.length(); i++)
            if (v.indexOf(right.charAt(i)) >= 0)
                rightSum++;
        return leftSum == rightSum;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of $s$.
- Space Complexity: $O(n)$. The space complexity for left and right are $O(n)$.
