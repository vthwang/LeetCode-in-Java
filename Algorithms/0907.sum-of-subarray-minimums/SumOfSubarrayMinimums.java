import java.util.Stack;

class SumOfSubarrayMinimums {
    private final int modulo = (int) (Math.pow(10, 9) + 7);

    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        long sumOfMinimums = 0;

        for (int i = 0; i <= arr.length; i++) {
            while (!stack.empty() && (i == arr.length || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                int leftBoundary = stack.empty() ? -1 : stack.peek();
                int rightBoundary = i;

                long count = (long) (mid - leftBoundary) * (rightBoundary - mid) % modulo;
                sumOfMinimums += (count * arr[mid]) % modulo;
                sumOfMinimums %= modulo;
            }
            stack.push(i);
        }

        return (int) sumOfMinimums;
    }
}