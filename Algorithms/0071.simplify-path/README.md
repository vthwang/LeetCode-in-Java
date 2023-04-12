# [71. Simplify Path](https://leetcode.com/problems/simplify-path/)

Given a string `path`, which is an **absolute path** (starting with a slash `'/'`) to a file or directory in a Unix-style file system, convert it to the simplified **canonical path**.

In a Unix-style file system, a period `'.'` refers to the current directory, a double period `'..'` refers to the directory up a level, and any multiple consecutive slashes (i.e. `'//'`) are treated as a single slash `'/'`. For this problem, any other format of periods such as `'...'` are treated as file/directory names.

The **canonical path** should have the following format:

- The path starts with a single slash `'/'`.
- Any two directories are separated by a single slash `'/'`.
- The path does not end with a trailing `'/'`.
- The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period `'.'` or double period `'..'`)

Return _the simplified **canonical path**_.

**Example 1:**

```
Input: path = "/home/"
Output: "/home"
Explanation: Note that there is no trailing slash after the last directory name.
```

**Example 2:**

```
Input: path = "/../"
Output: "/"
Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
```

**Example 3:**

```
Input: path = "/home//foo/"
Output: "/home/foo"
Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
```

## Solutions
### [Stack](SimplifyPath.java)

Idea: First, split array using `/`. Second, iterate array and pop the stack if the path is `..`, push the string while the path is not empty and `.`. Finally, generate result path using string builder.

```java
class Solution {
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
```

Complexity Analysis:

- Time Complexity: $O(n)$. $n$ is the length of path.
- Space Complexity: $O(n)$. Stack costs $O(n)$ space complexity.
