import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddBinaryTest {
    AddBinary addBinary = new AddBinary();

    @Test
    void Example1() {
        String a = "11", b = "1";

        Assertions.assertEquals("100", addBinary.addBinary(a, b));
    }

    @Test
    void Example2() {
        String a = "1010", b = "1011";

        Assertions.assertEquals("10101", addBinary.addBinary(a, b));
    }
}
