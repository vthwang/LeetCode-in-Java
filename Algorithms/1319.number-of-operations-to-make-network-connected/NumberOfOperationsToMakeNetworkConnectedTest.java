import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfOperationsToMakeNetworkConnectedTest {
    NumberOfOperationsToMakeNetworkConnected numberOfOperationsToMakeNetworkConnected = new NumberOfOperationsToMakeNetworkConnected();

    @Test
    void Example1() {
        int n = 4;
        int[][] connections = {{0, 1}, {0, 2}, {1, 2}};

        Assertions.assertEquals(1,  numberOfOperationsToMakeNetworkConnected.makeConnected(n,  connections));
    }

    @Test
    void Example2() {
        int n = 6;
        int[][] connections = {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}};

        Assertions.assertEquals(2,  numberOfOperationsToMakeNetworkConnected.makeConnected(n,  connections));
    }

    @Test
    void Example3() {
        int n = 6;
        int[][] connections = {{0, 1}, {0, 2}, {0, 3}, {1, 2}};

        Assertions.assertEquals(-1,  numberOfOperationsToMakeNetworkConnected.makeConnected(n,  connections));
    }
}
