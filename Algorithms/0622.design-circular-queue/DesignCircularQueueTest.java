import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DesignCircularQueueTest {
    @Test
    void Example1() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        Assertions.assertTrue(myCircularQueue.enQueue(1));
        Assertions.assertTrue(myCircularQueue.enQueue(2));
        Assertions.assertTrue(myCircularQueue.enQueue(3));
        Assertions.assertFalse(myCircularQueue.enQueue(4));
        Assertions.assertEquals(3, myCircularQueue.Rear());
        Assertions.assertTrue(myCircularQueue.isFull());
        Assertions.assertTrue(myCircularQueue.deQueue());
        Assertions.assertTrue(myCircularQueue.enQueue(4));
        Assertions.assertEquals(4, myCircularQueue.Rear());
    }
}
