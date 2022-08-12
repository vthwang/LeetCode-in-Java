import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DifferentWaysToAddParenthesesTest {
    DifferentWaysToAddParentheses DifferentWaysToAddParentheses = new DifferentWaysToAddParentheses();

    @Test
    void Example1() {
        String expression = "2-1-1";
        List<Integer> results = DifferentWaysToAddParentheses.diffWaysToCompute(expression);
        List<Integer> expectedResults = Arrays.asList(2, 0);

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String expression = "2*3-4*5";
        List<Integer> results = DifferentWaysToAddParentheses.diffWaysToCompute(expression);
        List<Integer> expectedResults = Arrays.asList(-34, -10, -14, -10, 10);

        Assertions.assertEquals(expectedResults, results);
    }
}
