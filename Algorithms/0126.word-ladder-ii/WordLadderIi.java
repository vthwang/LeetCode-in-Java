import java.util.*;

class WordLadderIi {
    private void bfs(Set<String> startSet, Set<String> endSet, Map<String, List<String>> map, Set<String> dict, boolean reverse) {
        if (startSet.size() == 0) return;
        if (startSet.size() > endSet.size()) {
            bfs(endSet, startSet, map, dict, !reverse);
            return;
        }

        Set<String> tmp = new HashSet<>();
        boolean finish = false;
        dict.removeAll(startSet);

        for (String s : startSet) {
            char[] chs = s.toCharArray();
            for (int i = 0; i < chs.length; i++) {
                char old = chs[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    chs[i] = c;
                    String word = new String(chs);

                    if (dict.contains(word)) {
                        if (endSet.contains(word)) {
                            finish = true;
                        } else {
                            tmp.add(word);
                        }

                        String key = reverse ? word : s;
                        String val = reverse ? s : word;

                        if (map.get(key) == null) {
                            map.put(key, new ArrayList<>());
                        }

                        map.get(key).add(val);
                    }
                }
                chs[i] = old;
            }
        }

        if (!finish) {
            bfs(tmp, endSet, map, dict, reverse);
        }
    }

    private void dfs(List<List<String>> res, List<String> list, String endWord, String word, Map<String, List<String>> map) {
        if (word.equals(endWord)) {
            res.add(new ArrayList<>(list));
            return;
        }

        if (map.get(word) == null) return;
        for (String next : map.get(word)) {
            list.add(next);
            dfs(res, list, endWord, next, map);
            list.remove(list.size() - 1);
        }
    }

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> res = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) return res;

        Map<String, List<String>> map = new HashMap<>();
        Set<String> startSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        startSet.add(beginWord);
        endSet.add(endWord);
        bfs(startSet, endSet, map, dict, false);

        List<String> list = new ArrayList<>();
        list.add(beginWord);
        dfs(res, list, endWord, beginWord, map);

        return res;
    }
}