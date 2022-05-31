import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsGraphBipartiteTest {
    IsGraphBipartite IsGraphBipartite = new IsGraphBipartite();

    @Test
    void Example1() {
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        boolean results = IsGraphBipartite.isBipartite(graph);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
        boolean results = IsGraphBipartite.isBipartite(graph);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }
}
