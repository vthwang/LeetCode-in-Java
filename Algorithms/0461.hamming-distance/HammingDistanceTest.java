import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HammingDistanceTest {
    HammingDistance HammingDistance = new HammingDistance();

    @Test
    void Example1() {
        int x = 1, y = 4;
        int results = HammingDistance.hammingDistance(x, y);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int x = 3, y = 1;
        int results = HammingDistance.hammingDistance(x, y);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
