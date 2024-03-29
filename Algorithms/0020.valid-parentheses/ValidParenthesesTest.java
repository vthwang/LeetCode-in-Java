import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void Example1() {
        String s = "()";
        boolean results = validParentheses.isValid(s);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "()[]{}";
        boolean results = validParentheses.isValid(s);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "(]";
        boolean results = validParentheses.isValid(s);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
