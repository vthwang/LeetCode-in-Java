import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    private final PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
    private final PriorityQueue<Integer> large = new PriorityQueue<>();
    private boolean even = true;

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if (even) {
            large.offer(num);
            small.offer(large.poll());
        } else {
            small.offer(num);
            large.offer(small.poll());
        }
        even = !even;
    }
    
    public double findMedian() {
        if (even)
            if (!small.isEmpty() && !large.isEmpty())
                return (small.peek() + large.peek()) / 2.0;
            else
                return 0;
        else
            if (!small.isEmpty())
                return small.peek();
            else
                return 0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */