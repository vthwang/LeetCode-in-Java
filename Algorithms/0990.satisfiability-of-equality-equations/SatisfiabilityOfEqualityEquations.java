class SatisfiabilityOfEqualityEquations {
    int[] parent = new int[26];

    private int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }

    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; i++) parent[i] = i;
        for (String e : equations) {
            if (e.charAt(1) == '=') {
                parent[find(e.charAt(0)- 'a')] = find(e.charAt(3) - 'a');
            }
        }
        for (String e : equations) {
            if (e.charAt(1) == '!' && find(e.charAt(0) - 'a') == find(e.charAt(3) - 'a')) {
                return false;
            }
        }
        return true;
    }
}