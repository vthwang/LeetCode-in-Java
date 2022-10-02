import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfDiceRollsWithTargetSumTest {
    NumberOfDiceRollsWithTargetSum NumberOfDiceRollsWithTargetSum = new NumberOfDiceRollsWithTargetSum();

    @Test
    void Example1() {
        int n = 1, k = 6, target = 3;
        int results = NumberOfDiceRollsWithTargetSum.numRollsToTarget(n, k, target);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 2, k = 6, target = 7;
        int results = NumberOfDiceRollsWithTargetSum.numRollsToTarget(n, k, target);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int n = 30, k = 30, target = 500;
        int results = NumberOfDiceRollsWithTargetSum.numRollsToTarget(n, k, target);
        int expectedResults = 222616187;

        Assertions.assertEquals(expectedResults, results);
    }
}
