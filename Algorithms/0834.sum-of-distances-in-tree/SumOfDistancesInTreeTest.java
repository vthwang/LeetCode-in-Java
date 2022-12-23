import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfDistancesInTreeTest {
    SumOfDistancesInTree sumOfDistancesInTree = new SumOfDistancesInTree();

    @Test
    void Example1() {
        int n = 6;
        int[][] edges = {{0,1},{0,2},{2,3},{2,4},{2,5}};

        Assertions.assertArrayEquals(new int[]{8,12,6,10,10,10}, sumOfDistancesInTree.sumOfDistancesInTree(n, edges));
    }

    @Test
    void Example2() {
        int n = 1;
        int[][] edges = {};

        Assertions.assertArrayEquals(new int[]{0}, sumOfDistancesInTree.sumOfDistancesInTree(n, edges));
    }

    @Test
    void Example3() {
        int n = 2;
        int[][] edges = {{1, 0}};

        Assertions.assertArrayEquals(new int[]{1, 1}, sumOfDistancesInTree.sumOfDistancesInTree(n, edges));
    }
}
