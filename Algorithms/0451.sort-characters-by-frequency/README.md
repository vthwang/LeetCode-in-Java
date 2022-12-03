# [451. Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/)

Given a string `s`, sort it in **decreasing order** based on the **frequency** of the characters. The **frequency** of a character is the number of times it appears in the string.

Return _the sorted string_. If there are multiple answers, return _any of them_.

**Example 1:**

```
Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
```

**Example 2:**

```
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
```

**Example 3:**

```
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
```

## Solutions
### [Sort by Frequency](./SortCharactersByFrequency.java)

Idea: Save characters frequency into hash map, then sort characters by frequency.  Finally, return the string sorted by frequency.

```java
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0) + 1);

        List<Character> list = new ArrayList<>(freq.keySet());
        list.sort((a, b) -> freq.get(b) - freq.get(a));
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            int frequency = freq.get(c);
            sb.append(String.valueOf(c).repeat(frequency));
        }
        return sb.toString();
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+k\log^k)$. $n$ is the length of $s$ and $k$ is the number of different characters in the string $s$. Loop all characters in string is $O(n)$, sort characters by frequency is $O(k\log^k)$. Generate the answer string needs to iterate $k$’s different characters and concat the string is $O(n)$. The total time complexity is $O(n + k\log^k + k + n)=O(n+k\log^k)$.
- Space Complexity: $O(n + k)$. Hash map is $O(k)$ and list is $O(k)$. The string builder is $O(n)$. Thus, the total space complexity is $O(n+k)$.

### [Bucket Sort](./SortCharactersByFrequency2.java)

Idea: Save characters frequency into hash map, then save the characters into the “frequency buckets”. Finally, return the string combination of characters from the first bucket to the last bucket.

```java
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int frequency = freq.getOrDefault(c, 0) + 1;
            freq.put(c, frequency);
            maxFreq = Math.max(maxFreq, frequency);
        }

        StringBuilder[] buckets = new StringBuilder[maxFreq + 1];
        for (int i = 0; i <= maxFreq; i++)
            buckets[i] = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            buckets[frequency].append(c);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = maxFreq; i > 0; i--) {
            StringBuilder bucket = buckets[i];
            for (int j = 0; j < bucket.length(); j++) {
                for (int k = 0; k < i; k++) {
                    sb.append(bucket.charAt(j));
                }
            }
        }
        return sb.toString();
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n+k)$. $n$ is the length of $s$ and $k$ is the number of different characters in the string $s$. Loop all characters in string is $O(n)$, create bucket and save different characters int bucket is $O(k)$. Generate the answer string needs to iterate $k$’s buckets and concat the string is $O(n)$. The total time complexity is $O(n + k + k + n)=O(n+k)$.
- Space Complexity: $O(n + k)$. Hash map is $O(k)$ and bucket is $O(k)$. The string builder is $O(n)$. Thus, the total space complexity is $O(n+k)$.
