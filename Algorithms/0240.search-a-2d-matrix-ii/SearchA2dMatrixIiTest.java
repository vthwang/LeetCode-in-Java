import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchA2dMatrixIiTest {
    SearchA2dMatrixIi SearchA2dMatrixIi = new SearchA2dMatrixIi();

    @Test
    void Example1() {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};

        int target = 5;
        boolean results = SearchA2dMatrixIi.searchMatrix(matrix, target);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};

        int target = 20;
        boolean results = SearchA2dMatrixIi.searchMatrix(matrix, target);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
