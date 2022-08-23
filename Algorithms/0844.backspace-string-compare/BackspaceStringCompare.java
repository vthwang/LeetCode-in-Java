import java.util.Stack;

class BackspaceStringCompare {
    private String filterString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        StringBuilder res = new StringBuilder();
        int popCount = 0;
        while (!stack.isEmpty()) {
            if (stack.peek() == '#') {
                popCount++;
                stack.pop();
            } else if (popCount != 0) {
                stack.pop();
                popCount--;
            } else {
                res.append(stack.pop());
            }
        }
        return res.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        String newS = filterString(s);
        String newT = filterString(t);
        return newS.equals(newT);
    }
}