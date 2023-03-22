import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumScoreOfAPathBetweenTwoCitiesTest {
    MinimumScoreOfAPathBetweenTwoCities minimumScoreOfAPathBetweenTwoCities = new MinimumScoreOfAPathBetweenTwoCities();

    @Test
    void Example1() {
        int n = 4;
        int[][] roads = {{1, 2, 9}, {2, 3, 6}, {2, 4, 5}, {1, 4, 7}};

        Assertions.assertEquals(5,  minimumScoreOfAPathBetweenTwoCities.minScore(n,  roads));
    }

    @Test
    void Example2() {
        int n = 4;
        int[][] roads = {{1, 2, 2}, {1, 3, 4}, {3, 4, 7}};

        Assertions.assertEquals(2,  minimumScoreOfAPathBetweenTwoCities.minScore(n,  roads));
    }
}
