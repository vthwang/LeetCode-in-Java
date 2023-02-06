# [438. Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)

Given two strings `s` and `p`, return _an array of all the start indices of_ `p` _'s anagrams in_ `s`. You may return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

```
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
```

**Example 2:**

```
Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
```

## Solutions
### [Sliding Window](FindAllAnagramsInAString.java)

Idea: We use sliding window to iterate `p` size string in `s`. Then we can find the indices of anagram strings.

```java
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), m = p.length();

        if (n < m)
            return new ArrayList<>();

        List<Integer> res = new ArrayList<>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < m; i++) {
            sCount[s.charAt(i) - 'a']++;
            pCount[p.charAt(i) - 'a']++;
        }

        if (Arrays.equals(sCount, pCount))
            res.add(0);

        for (int i = 0; i < n - m; i++) {
            sCount[s.charAt(i) - 'a']--;
            sCount[s.charAt(i + m) - 'a']++;

            if (Arrays.equals(sCount, pCount))
                res.add(i + 1);
        }

        return res;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n-m)$. $n$ is the length of `s` and $m$ is the length of `p`. The first loop costs $O(n)$ and the second loop costs $O(26\times(n-m))$. The total time complexity is $O(26n-25m)=O(n-m)$.
- Space Complexity: $O(1)$. The size of `sCount` and `pCount` is 26 which is constant. Thus, the total space complexity is $O(1)$.
