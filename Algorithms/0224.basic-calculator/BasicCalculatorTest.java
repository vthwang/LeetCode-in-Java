import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicCalculatorTest {
    BasicCalculator BasicCalculator = new BasicCalculator();

    @Test
    void Example1() {
        String s = "1 + 1";
        int results = BasicCalculator.calculate(s);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = " 2-1 + 2 ";
        int results = BasicCalculator.calculate(s);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "(1+(4+5+2)-3)+(6+8)";
        int results = BasicCalculator.calculate(s);
        int expectedResults = 23;

        Assertions.assertEquals(expectedResults, results);
    }
}
