import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplyStringsTest {
    MultiplyStrings MultiplyStrings = new MultiplyStrings();

    @Test
    void Example1() {
        String num1 = "2", num2 = "3";
        String results = MultiplyStrings.multiply(num1, num2);
        String expectedResults = "6";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String num1 = "123", num2 = "456";
        String results = MultiplyStrings.multiply(num1, num2);
        String expectedResults = "56088";

        Assertions.assertEquals(expectedResults, results);
    }
}
