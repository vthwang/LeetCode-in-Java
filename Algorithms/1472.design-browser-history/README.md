# [1472. Design Browser History](https://leetcode.com/problems/design-browser-history/)

You have a **browser** of one tab where you start on the `homepage` and you can visit another `url`, get back in the history number of `steps` or move forward in the history number of `steps`.

Implement the `BrowserHistory` class:

- `BrowserHistory(string homepage)` Initializes the object with the `homepage` of the browser.
- `void visit(string url)` Visits `url` from the current page. It clears up all the forward history.
- `string back(int steps)` Move `steps` back in history. If you can only return `x` steps in the history and `steps > x`, you will return only `x` steps. Return the current `url` after moving back in history **at most** `steps`.
- `string forward(int steps)` Move `steps` forward in history. If you can only forward `x` steps in the history and `steps > x`, you will forward only `x` steps. Return the current `url` after forwarding in history **at most** `steps`.

**Example:**

```
<b>Input:</b>
["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
<b>Output:</b>
[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com","leetcode.com"]

<b>Explanation:</b>
BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
browserHistory.back(1);                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
browserHistory.back(1);                   // You are in "facebook.com", move back to "google.com" return "google.com"
browserHistory.forward(1);                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
browserHistory.forward(2);                // You are in "linkedin.com", you cannot move forward any steps.
browserHistory.back(2);                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
browserHistory.back(7);                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
```

## Solutions
### [Two Stacks](DesignBrowserHistory.java)

Idea: Use two stacks to save the browse history. `s1` is saving the backward pages and `s2` is saving the forward pages.

```java
class BrowserHistory {
    Deque<String> s1 = new LinkedList<>();
    Deque<String> s2 = new LinkedList<>();

    public BrowserHistory(String homepage) {
        s1.push(homepage);
    }
    
    public void visit(String url) {
        s1.push(url);
        s2.clear();
    }
    
    public String back(int steps) {
        for (int i = 0; i < steps && s1.size() > 1; i++) {
            s2.push(s1.pop());
        }
        return s1.peek();
    }
    
    public String forward(int steps) {
        for (int i = 0; i < steps && !s2.isEmpty(); i++) {
            s1.push(s2.pop());
        }
        return s1.peek();
    }
}
```

Complexity Analysis:

- Time Complexity: $O(1)$. The maximum of steps is 100, so the time complexity is constant which is $O(1)$.
- Space Complexity: $O(1)$.
