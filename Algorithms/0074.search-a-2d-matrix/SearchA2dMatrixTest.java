import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchA2dMatrixTest {
    SearchA2dMatrix SearchA2dMatrix = new SearchA2dMatrix();

    @Test
    void Example1() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        boolean results = SearchA2dMatrix.searchMatrix(matrix, target);
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 21;
        boolean results = SearchA2dMatrix.searchMatrix(matrix, target);
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example3() {
        int[][] matrix = {{1}};
        int target = 0;
        boolean results = SearchA2dMatrix.searchMatrix(matrix, target);
        boolean expectedResult = false;

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example4() {
        int[][] matrix = {{1, 3}};
        int target = 3;
        boolean results = SearchA2dMatrix.searchMatrix(matrix, target);
        boolean expectedResult = true;

        Assertions.assertEquals(expectedResult, results);
    }
}
