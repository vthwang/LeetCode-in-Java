import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PossibleBipartitionTest {
    PossibleBipartition possibleBipartition = new PossibleBipartition();
    PossibleBipartition2 possibleBipartition2 = new PossibleBipartition2();

    @Test
    void Example1() {
        int n = 4;
        int[][] dislikes = {{1, 2}, {1, 3}, {2, 4}};

        Assertions.assertTrue(possibleBipartition.possibleBipartition(n, dislikes));
        Assertions.assertTrue(possibleBipartition2.possibleBipartition(n, dislikes));
    }

    @Test
    void Example2() {
        int n = 3;
        int[][] dislikes = {{1, 2}, {1, 3}, {2, 3}};

        Assertions.assertFalse(possibleBipartition.possibleBipartition(n, dislikes));
        Assertions.assertFalse(possibleBipartition2.possibleBipartition(n, dislikes));
    }

    @Test
    void Example3() {
        int n = 5;
        int[][] dislikes = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}};

        Assertions.assertFalse(possibleBipartition.possibleBipartition(n, dislikes));
        Assertions.assertFalse(possibleBipartition2.possibleBipartition(n, dislikes));
    }
}
