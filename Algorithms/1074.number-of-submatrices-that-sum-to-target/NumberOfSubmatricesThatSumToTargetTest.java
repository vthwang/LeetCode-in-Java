import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfSubmatricesThatSumToTargetTest {
    NumberOfSubmatricesThatSumToTarget NumberOfSubmatricesThatSumToTarget = new NumberOfSubmatricesThatSumToTarget();

    @Test
    void Example1() {
        int[][] matrix = {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
        int target = 0;
        int results = NumberOfSubmatricesThatSumToTarget.numSubmatrixSumTarget(matrix, target);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] matrix = {{1,-1},{-1,1}};
        int target = 0;
        int results = NumberOfSubmatricesThatSumToTarget.numSubmatrixSumTarget(matrix, target);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[][] matrix = {{904}};
        int target = 0;
        int results = NumberOfSubmatricesThatSumToTarget.numSubmatrixSumTarget(matrix, target);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
