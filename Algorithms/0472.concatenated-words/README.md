# [472. Concatenated Words](https://leetcode.com/problems/concatenated-words/)

Given an array of strings `words` ( **without duplicates**), return _all the **concatenated words** in the given list of_ `words`.

A **concatenated word** is defined as a string that is comprised entirely of at least two shorter words in the given array.

**Example 1:**

```
Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats";
"dogcatsdog" can be concatenated by "dog", "cats" and "dog";
"ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
```

**Example 2:**

```
Input: words = ["cat","dog","catdog"]
Output: ["catdog"]
```

## Solutions
### [Trie + DFS](ConcatenatedWords.java)

Idea: We first sort array by string length, then using DFS put characters in word to Trie one by one. If we found a word can be concatenated by other words, we don’t need to insert it into trie. Also, to lower the time complexity, we use a boolean array to memorize the last word we iterate in the trie.

```java
class Solution {
    WordTrie trie = new WordTrie();

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans = new ArrayList<>();
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() == 0)
                continue;
            boolean[] visited = new boolean[word.length()];
            if (dfs(word, 0, visited))
                ans.add(word);
            else
                insert(word);
        }
        return ans;
    }

    private boolean dfs(String word, int start, boolean[] visited) {
        if (word.length() == start)
            return true;
        if (visited[start])
            return false;
        visited[start] = true;
        WordTrie node = trie;
        for (int i = start; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            node = node.children[index];
            if (node == null)
                return false;
            if (node.isEnd)
                if (dfs(word, i + 1, visited))
                    return true;
        }
        return false;
    }

    private void insert(String word) {
        WordTrie node = trie;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = c - 'a';
            if (node.children[index] == null)
                node.children[index] = new WordTrie();
            node = node.children[index];
        }
        node. isEnd = true;
    }
}

class WordTrie {
    WordTrie[] children;
    boolean isEnd;

    public WordTrie() {
        children = new WordTrie[26];
        isEnd = false;
    }
}
```

Complexity Analysis:

- Time Complexity: $O(n\log n + m)$. $n$ is the length of `words`. $m$ is the length of the longest string in the array `words`. Sort words costs $O(n\log n)$ and determine a word is concatenated word costs $O(m)$. The total time complexity is $O(n\log n + m)$
- Space Complexity: $O(m\times n)$. We have $n$ words and the worst case is all words with $m$ length. Thus, the total space complexity is $O(m\times n)$.
