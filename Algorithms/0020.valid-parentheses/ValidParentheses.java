import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;

        Map<Character, Character> pairs = new HashMap<>(){{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(c))
                    return false;
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}