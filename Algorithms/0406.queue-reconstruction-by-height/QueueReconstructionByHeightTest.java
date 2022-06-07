import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueReconstructionByHeightTest {
    QueueReconstructionByHeight QueueReconstructionByHeight = new QueueReconstructionByHeight();

    @Test
    void Example1() {
        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] results = QueueReconstructionByHeight.reconstructQueue(people);
        int[][] expectedResults = {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] people = {{6, 0}, {5, 0}, {4, 0}, {3, 2}, {2, 2}, {1, 4}};
        int[][] results = QueueReconstructionByHeight.reconstructQueue(people);
        int[][] expectedResults = {{4, 0}, {5, 0}, {2, 2}, {3, 2}, {1, 4}, {6, 0}};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
