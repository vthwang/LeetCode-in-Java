import java.util.ArrayList;
import java.util.List;

class LexicographicallySmallestEquivalentString {
    int minChar;

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[][] adjMatrix = new int[26][26];
        for (int i = 0; i < s1.length(); i++) {
            adjMatrix[s1.charAt(i) - 'a'][s2.charAt(i) - 'a'] = 1;
            adjMatrix[s2.charAt(i) - 'a'][s1.charAt(i) - 'a'] = 1;
        }

        int[] mappingChar = new int[26];
        for (int i = 0; i < 26; i++)
            mappingChar[i] = i;

        boolean[] visited = new boolean[26];
        for (int c = 0; c < 26; c++) {
            if (!visited[c]) {
                List<Integer> component = new ArrayList<>();
                minChar = 27;
                dfs(c, adjMatrix, visited, component);
                for (int vertex : component)
                    mappingChar[vertex] = minChar;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c : baseStr.toCharArray())
            ans.append((char) (mappingChar[c - 'a'] + 'a'));

        return ans.toString();
    }

    private void dfs(int src, int[][] adjMatrix, boolean[] visited, List<Integer> component) {
        visited[src] = true;
        component.add(src);
        minChar = Math.min(minChar, src);

        for (int i = 0; i < 26; i++) {
            if (adjMatrix[src][i] != 0 && !visited[i])
                dfs(i, adjMatrix, visited, component);
        }
    }
}