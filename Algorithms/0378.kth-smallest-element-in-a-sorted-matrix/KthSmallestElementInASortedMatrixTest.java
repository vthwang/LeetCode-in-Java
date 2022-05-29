import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthSmallestElementInASortedMatrixTest {
    KthSmallestElementInASortedMatrix KthSmallestElementInASortedMatrix = new KthSmallestElementInASortedMatrix();
    KthSmallestElementInASortedMatrix2 KthSmallestElementInASortedMatrix2 = new KthSmallestElementInASortedMatrix2();

    @Test
    void Example1() {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};

        int k = 8;
        int results = KthSmallestElementInASortedMatrix.kthSmallest(matrix, k);
        int expectedResults = 13;

        Assertions.assertEquals(expectedResults, results);

        results = KthSmallestElementInASortedMatrix2.kthSmallest(matrix, k);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] matrix = {{-5}};

        int k = 1;
        int results = KthSmallestElementInASortedMatrix.kthSmallest(matrix, k);
        int expectedResults = -5;

        Assertions.assertEquals(expectedResults, results);

        results = KthSmallestElementInASortedMatrix2.kthSmallest(matrix, k);
        Assertions.assertEquals(expectedResults, results);
    }
}
