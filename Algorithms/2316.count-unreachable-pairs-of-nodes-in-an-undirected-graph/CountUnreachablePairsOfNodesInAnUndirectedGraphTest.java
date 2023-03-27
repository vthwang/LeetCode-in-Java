import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountUnreachablePairsOfNodesInAnUndirectedGraphTest {
    CountUnreachablePairsOfNodesInAnUndirectedGraph countUnreachablePairsOfNodesInAnUndirectedGraph = new CountUnreachablePairsOfNodesInAnUndirectedGraph();

    @Test
    void Example1() {
        int n = 3;
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}};

        Assertions.assertEquals(0, countUnreachablePairsOfNodesInAnUndirectedGraph.countPairs(n, edges));
    }

    @Test
    void Example2() {
        int n = 7;
        int[][] edges = {{0, 2}, {0, 5}, {2, 4}, {1, 6}, {5, 4}};

        Assertions.assertEquals(14, countUnreachablePairsOfNodesInAnUndirectedGraph.countPairs(n, edges));
    }
}
