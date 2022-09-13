import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfProvincesTest {
    NumberOfProvinces NumberOfProvinces = new NumberOfProvinces();

    @Test
    void Example1() {
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int results = NumberOfProvinces.findCircleNum(isConnected);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] isConnected = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int results = NumberOfProvinces.findCircleNum(isConnected);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }
}
