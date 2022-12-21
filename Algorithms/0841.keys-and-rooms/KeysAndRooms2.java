import java.util.List;

class KeysAndRooms2 {
    boolean[] visited;
    int num;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        num = 0;
        visited = new boolean[n];
        dfs(rooms, 0);
        return num == n;
    }

    private void dfs(List<List<Integer>> rooms, int room) {
        visited[room] = true;
        num++;
        for (int key : rooms.get(room)) {
            if (!visited[key])
                dfs(rooms, key);
        }
    }
}