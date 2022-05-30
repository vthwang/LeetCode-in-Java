import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BeautifulArrangementIiTest {
    BeautifulArrangementIi BeautifulArrangementIi = new BeautifulArrangementIi();

    @Test
    void Example1() {
        int n = 3, k = 1;
        int[] results = BeautifulArrangementIi.constructArray(n, k);
        int[] expectedResults = {1, 2, 3};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 3, k = 2;
        int[] results = BeautifulArrangementIi.constructArray(n, k);
        int[] expectedResults = {1, 3, 2};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
