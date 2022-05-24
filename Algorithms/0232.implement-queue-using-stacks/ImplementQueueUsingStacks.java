import java.util.Stack;

class MyQueue {
    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        in.push(x);
    }

    private void in2out() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
    }
    
    public int pop() {
        in2out();
        return out.pop();
    }
    
    public int peek() {
        in2out();
        return out.peek();
    }
    
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */