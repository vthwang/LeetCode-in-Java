import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<List<Integer>> q = new LinkedList<>();
        List<Integer> currList = new ArrayList<>();
        currList.add(0);
        q.add(currList);
        while (!q.isEmpty()) {
            currList = q.poll();
            int v = currList.get(currList.size() - 1);
            if (v == graph.length - 1) {
                res.add(currList);
                continue;
            }
            for (int i : graph[v]) {
                List<Integer> temp = new ArrayList<>(currList);
                temp.add(i);
                q.add(temp);
            }
        }
        return res;
    }
}