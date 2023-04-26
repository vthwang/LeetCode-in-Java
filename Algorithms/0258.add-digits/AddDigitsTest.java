import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddDigitsTest {
    AddDigits addDigits = new AddDigits();

    @Test
    void Example1() {
        int num = 38;

        Assertions.assertEquals(2, addDigits.addDigits(num));
    }

    @Test
    void Example2() {
        int num = 0;

        Assertions.assertEquals(0, addDigits.addDigits(num));
    }
}
