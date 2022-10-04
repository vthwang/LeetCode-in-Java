import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesesTest {
    GenerateParentheses GenerateParentheses = new GenerateParentheses();

    @Test
    void Example1() {
        int n = 3;
        List<String> results = GenerateParentheses.generateParenthesis(n);
        List<String> expectedResults = new ArrayList<>();
        expectedResults.add("((()))");
        expectedResults.add("(()())");
        expectedResults.add("(())()");
        expectedResults.add("()(())");
        expectedResults.add("()()()");

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 1;
        List<String> results = GenerateParentheses.generateParenthesis(n);
        List<String> expectedResults = new ArrayList<>();
        expectedResults.add("()");

        Assertions.assertEquals(expectedResults, results);
    }
}
