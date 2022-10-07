import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyCalendarThreeTest {
    @Test
    void Example1() {
        MyCalendarThree myCalendarThree = new MyCalendarThree();
        Assertions.assertEquals(1, myCalendarThree.book(10, 20));
        Assertions.assertEquals(1, myCalendarThree.book(50, 60));
        Assertions.assertEquals(2, myCalendarThree.book(10, 40));
        Assertions.assertEquals(3, myCalendarThree.book(5, 15));
        Assertions.assertEquals(3, myCalendarThree.book(5, 10));
        Assertions.assertEquals(3, myCalendarThree.book(25, 55));
    }
}
