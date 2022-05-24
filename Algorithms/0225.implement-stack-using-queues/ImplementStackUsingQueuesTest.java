import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImplementStackUsingQueuesTest {
    @Test
    void Example1() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        Assertions.assertEquals(2, myStack.top());
        Assertions.assertEquals(2, myStack.pop());
        Assertions.assertFalse(myStack.empty());
    }
}
