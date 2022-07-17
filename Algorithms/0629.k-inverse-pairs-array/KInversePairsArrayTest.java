import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KInversePairsArrayTest {
    KInversePairsArray KInversePairsArray = new KInversePairsArray();

    @Test
    void Example1() {
        int n = 3, k = 0;
        int results = KInversePairsArray.kInversePairs(n, k);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 3, k = 1;
        int results = KInversePairsArray.kInversePairs(n, k);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
