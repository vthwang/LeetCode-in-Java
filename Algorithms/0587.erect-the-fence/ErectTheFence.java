import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Stack;

class ErectTheFence {
    public int orientation(int[] p, int[] q, int[] r) {
        return (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1]);
    }

    public int[][] outerTrees(int[][] trees) {
        Arrays.sort(trees, new Comparator<int[]>() {
            public int compare(int[] p, int[] q) {
                return q[0] - p[0] == 0 ? q[1] - p[1] : q[0] - p[0];
            }
        });
        Stack<int[]> hull = new Stack<>();
        for (int[] tree : trees) {
            while (hull.size() >= 2 && orientation(hull.get(hull.size() - 2), hull.get(hull.size() - 1), tree) > 0)
                hull.pop();
            hull.push(tree);
        }
        hull.pop();
        for (int i = trees.length - 1; i >= 0; i--) {
            while (hull.size() >= 2 && orientation(hull.get(hull.size() - 2), hull.get(hull.size() - 1), trees[i]) > 0)
                hull.pop();
            hull.push(trees[i]);
        }
        HashSet<int[]> ret = new HashSet<>(hull);
        return ret.toArray(new int[ret.size()][]);
    }
}