import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasicCalculatorIiTest {
    BasicCalculatorIi BasicCalculatorIi = new BasicCalculatorIi();

    @Test
    void Example1() {
        String s = "3+2*2";
        int results = BasicCalculatorIi.calculate(s);
        int expectedResults = 7;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = " 3/2 ";
        int results = BasicCalculatorIi.calculate(s);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = " 3+5 / 2 ";
        int results = BasicCalculatorIi.calculate(s);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }
}
