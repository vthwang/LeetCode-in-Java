import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImplementQueueUsingStacksTest {
    @Test
    void Example1() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        Assertions.assertEquals(1, myQueue.peek());
        Assertions.assertEquals(1, myQueue.pop());
        Assertions.assertFalse(myQueue.empty());
    }
}
