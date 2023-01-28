import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ConcatenatedWords {
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