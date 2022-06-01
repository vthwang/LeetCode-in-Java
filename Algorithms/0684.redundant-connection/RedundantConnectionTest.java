import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RedundantConnectionTest {
    RedundantConnection RedundantConnection = new RedundantConnection();

    @Test
    void Example1() {
        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};
        int[] results = RedundantConnection.findRedundantConnection(edges);
        int[] expectedResults = {2, 3};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        int[] results = RedundantConnection.findRedundantConnection(edges);
        int[] expectedResults = {1, 4};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
