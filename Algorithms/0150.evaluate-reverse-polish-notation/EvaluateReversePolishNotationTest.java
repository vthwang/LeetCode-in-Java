import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvaluateReversePolishNotationTest {
    EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
    EvaluateReversePolishNotation2 evaluateReversePolishNotation2 = new EvaluateReversePolishNotation2();

    @Test
    void Example1() {
        String[] tokens = {"2", "1", "+", "3", "*"};

        Assertions.assertEquals(9, evaluateReversePolishNotation.evalRPN(tokens));
        Assertions.assertEquals(9, evaluateReversePolishNotation2.evalRPN(tokens));
    }

    @Test
    void Example2() {
        String[] tokens = {"4", "13", "5", "/", "+"};

        Assertions.assertEquals(6, evaluateReversePolishNotation.evalRPN(tokens));
        Assertions.assertEquals(6, evaluateReversePolishNotation2.evalRPN(tokens));
    }

    @Test
    void Example3() {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        Assertions.assertEquals(22, evaluateReversePolishNotation.evalRPN(tokens));
        Assertions.assertEquals(22, evaluateReversePolishNotation2.evalRPN(tokens));
    }
}
