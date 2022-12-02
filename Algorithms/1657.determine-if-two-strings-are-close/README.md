# [1657. Determine if Two Strings Are Close](https://leetcode.com/problems/determine-if-two-strings-are-close/)

Two strings are considered **close** if you can attain one from the other using the following operations:

- Operation 1: Swap any two **existing** characters.


  - For example, `a<u>b</u>cd<u>e</u> -> a<u>e</u>cd<u>b</u>`
- Operation 2: Transform **every** occurrence of one **existing** character into another **existing** character, and do the same with the other character.

  - For example, `<u>aa</u>c<u>abb</u> -> <u>bb</u>c<u>baa</u>` (all `a`'s turn into `b`'s, and all `b`'s turn into `a`'s)

You can use the operations on either string as many times as necessary.

Given two strings, `word1` and `word2`, return `true` _if_ `word1` _and_ `word2` _are **close**, and_ `false` _otherwise._

**Example 1:**

```
Input: word1 = "abc", word2 = "bca"
Output: true
Explanation: You can attain word2 from word1 in 2 operations.
Apply Operation 1: "a<u>bc</u>" -> "a<u>cb</u>"
Apply Operation 1: "<u>a</u>c<u>b</u>" -> "<u>b</u>c<u>a</u>"
```

**Example 2:**

```
Input: word1 = "a", word2 = "aa"
Output: false
Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
```

**Example 3:**

```
Input: word1 = "cabbba", word2 = "abbccc"
Output: true
Explanation: You can attain word2 from word1 in 3 operations.
Apply Operation 1: "ca<u>b</u>bb<u>a</u>" -> "ca<u>a</u>bb<u>b</u>"
Apply Operation 2: "<u>c</u>aa<u>bbb</u>" -> "<u>b</u>aa<u>ccc</u>"
Apply Operation 2: "<u>baa</u>ccc" -> "<u>abb</u>ccc"
```

## Solutions
### Hash Table

Idea: The questions defines two strings are close with (1) Contains exactly the same characters (2) Put the number of repetitions of each character in two arrays, and they are the same after sorting. Thus, there are the steps of getting answer.

- If two strings length are different, return `false`.
- Put two input strings into two arrays with size 26.
- Loop these two arrays at the same time. If the same character appears in the first array as 0, but the other is larger than 1, return `false`. (Because it fails the condition 1)
- If the arrays are different after sorting, return `false`. (Because it fails the condition 2)
- Otherwise, return `true`.

```java
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            arr1[word1.charAt(i) - 'a']++;
            arr2[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((arr1[i] == 0 && arr2[i] != 0) || (arr1[i] != 0 && arr2[i] == 0))
                return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of input String.
- Space Complexity: $O(1)$. We only use constant size of array. The input of sorting is constant as well. Thus, the total space complexity is $O(1)$.
