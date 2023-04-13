import java.util.Stack;

class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pushIndex = 0, popIndex = 0;
        while (popIndex < popped.length) {
            if (stack.isEmpty() && pushIndex < pushed.length) {
                stack.push(pushed[pushIndex++]);
            } else if (stack.peek() == popped[popIndex]) {
                stack.pop();
                popIndex++;
            } else if (pushIndex < pushed.length) {
                stack.push(pushed[pushIndex++]);
            } else {
                return false;
            }
        }

        return true;
    }
}