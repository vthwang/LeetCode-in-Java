import java.util.*;

class SingleThreadedCpu {
    public int[] getOrder(int[][] tasks) {
        int[][] newTasks = new int[tasks.length][3];
        for (int i = 0; i < tasks.length; i++) {
            newTasks[i][0] = tasks[i][0];
            newTasks[i][1] = tasks[i][1];
            newTasks[i][2] = i;
        }

        Arrays.sort(newTasks, Comparator.comparingInt(a -> a[0]));
        // pq data: new int[]{processingTime, index}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] != b[0] ? (a[0] - b[0]) : (a[1] - b[1])));
        int[] ans = new int[tasks.length];
        int ansIndex = 0, currTime = 0;
        for (int i = 0; i < newTasks.length; i++) {
            while (currTime < newTasks[i][0] && !pq.isEmpty()) {
                int[] topTask = pq.remove();
                ans[ansIndex++] = topTask[1];
                currTime += topTask[0];
            }
            currTime = Math.max(currTime, newTasks[i][0]);
            pq.add(new int[]{newTasks[i][1], newTasks[i][2]});
        }
        while (!pq.isEmpty()) {
            int[] topTask = pq.remove();
            ans[ansIndex++] = topTask[1];
        }

        return ans;
    }
}