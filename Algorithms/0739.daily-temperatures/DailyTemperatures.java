import java.util.Stack;

class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] dist = new int[n];
        Stack<Integer> indexes = new Stack<>();
        for (int curIndex = 0; curIndex < n; curIndex++) {
            while (!indexes.isEmpty() && temperatures[curIndex] > temperatures[indexes.peek()]) {
                int preIndex = indexes.pop();
                dist[preIndex] = curIndex - preIndex;
            }
            indexes.add(curIndex);
        }
        return dist;
    }
}