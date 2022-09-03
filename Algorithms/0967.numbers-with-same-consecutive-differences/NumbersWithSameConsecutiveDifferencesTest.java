import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumbersWithSameConsecutiveDifferencesTest {
    NumbersWithSameConsecutiveDifferences NumbersWithSameConsecutiveDifferences = new NumbersWithSameConsecutiveDifferences();

    @Test
    void Example1() {
        int n = 3, k = 7;
        int[] results = NumbersWithSameConsecutiveDifferences.numsSameConsecDiff(n, k);
        int[] expectedResults = {181, 292, 707, 818, 929};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 2, k = 1;
        int[] results = NumbersWithSameConsecutiveDifferences.numsSameConsecDiff(n, k);
        int[] expectedResults = {12, 10, 23, 21, 34, 32, 45, 43, 56, 54, 67, 65, 78, 76, 89, 87, 98};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
