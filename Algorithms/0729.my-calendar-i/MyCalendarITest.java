import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyCalendarITest {
    @Test
    void Example1() {
        MyCalendar myCalendar = new MyCalendar();
        boolean result = myCalendar.book(10, 20);
        Assertions.assertTrue(result);

        result = myCalendar.book(15, 25);
        Assertions.assertFalse(result);

        result = myCalendar.book(20, 30);
        Assertions.assertTrue(result);
    }
}
