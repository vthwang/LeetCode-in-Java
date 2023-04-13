import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateStackSequencesTest {
    ValidateStackSequences validateStackSequences = new ValidateStackSequences();

    @Test
    void Example1() {
        int[] pushed = {1, 2, 3, 4, 5}, popped = {4, 5, 3, 2, 1};

        Assertions.assertTrue(validateStackSequences.validateStackSequences(pushed, popped));
    }

    @Test
    void Example2() {
        int[] pushed = {1, 2, 3, 4, 5}, popped = {4, 3, 5, 1, 2};

        Assertions.assertFalse(validateStackSequences.validateStackSequences(pushed, popped));
    }

    @Test
    void Example3() {
        int[] pushed = {4, 0, 1, 2, 3}, popped = {4, 2, 3, 0, 1};

        Assertions.assertFalse(validateStackSequences.validateStackSequences(pushed, popped));
    }
}
