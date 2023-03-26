import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {
    ReorderRoutesToMakeAllPathsLeadToTheCityZero reorderRoutesToMakeAllPathsLeadToTheCityZero = new ReorderRoutesToMakeAllPathsLeadToTheCityZero();

    @Test
    void Example1() {
        int n = 6;
        int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};

        Assertions.assertEquals(3, reorderRoutesToMakeAllPathsLeadToTheCityZero.minReorder(n, connections));
    }

    @Test
    void Example2() {
        int n = 5;
        int[][] connections = {{1, 0}, {1, 2}, {3, 2}, {3, 4}};

        Assertions.assertEquals(2, reorderRoutesToMakeAllPathsLeadToTheCityZero.minReorder(n, connections));
    }

    @Test
    void Example3() {
        int n = 3;
        int[][] connections = {{1, 0}, {2, 0}};

        Assertions.assertEquals(0, reorderRoutesToMakeAllPathsLeadToTheCityZero.minReorder(n, connections));
    }
}
