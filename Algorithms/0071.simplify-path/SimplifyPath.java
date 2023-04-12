import java.util.Stack;

class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] pathArray = path.split("/");

        for (String s : pathArray) {
            if (s.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (s.length() != 0 && !s.equals(".")) {
                stack.push(s);
            }
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.insert(0, "/" + stack.pop());
        }

        return res.toString().length() > 0 ? res.toString() : "/";
    }
}