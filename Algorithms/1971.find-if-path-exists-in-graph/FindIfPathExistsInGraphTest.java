import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindIfPathExistsInGraphTest {
    FindIfPathExistsInGraph findIfPathExistsInGraph = new FindIfPathExistsInGraph();
    FindIfPathExistsInGraph2 findIfPathExistsInGraph2 = new FindIfPathExistsInGraph2();
    FindIfPathExistsInGraph3 findIfPathExistsInGraph3 = new FindIfPathExistsInGraph3();

    @Test
    void Example1() {
        int n = 3, source = 0, destination = 2;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};

        Assertions.assertTrue(findIfPathExistsInGraph.validPath(n, edges, source, destination));
        Assertions.assertTrue(findIfPathExistsInGraph2.validPath(n, edges, source, destination));
        Assertions.assertTrue(findIfPathExistsInGraph3.validPath(n, edges, source, destination));
    }

    @Test
    void Example2() {
        int n = 6, source = 0, destination = 5;
        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};

        Assertions.assertFalse(findIfPathExistsInGraph.validPath(n, edges, source, destination));
        Assertions.assertFalse(findIfPathExistsInGraph2.validPath(n, edges, source, destination));
        Assertions.assertFalse(findIfPathExistsInGraph3.validPath(n, edges, source, destination));
    }
}