import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PalindromePartitioning {
    boolean[][] f;
    List<List<String>> ans  = new ArrayList<>();
    List<String> temp = new ArrayList<>();
    int n;

    public List<List<String>> partition(String s) {
        n = s.length();
        f = new boolean[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(f[i], true);
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                f[i][j] = (s.charAt(i) == s.charAt(j)) && f[i + 1][j - 1];
            }
        }

        dfs(s, 0);
        return ans;
    }

    private void dfs(String s, int i) {
        if (i == n) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int j = i; j < n; j++) {
            if (f[i][j]) {
                temp.add(s.substring(i, j + 1));
                dfs(s, j + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}