import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TopKFrequentElementsTest {
    TopKFrequentElements TopKFrequentElements = new TopKFrequentElements();

    @Test
    void Example1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] results = TopKFrequentElements.topKFrequent(nums, k);
        int[] expectedResults = {1, 2};

        Assertions.assertArrayEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1};
        int k = 1;

        int[] results = TopKFrequentElements.topKFrequent(nums, k);
        int[] expectedResults = {1};

        Assertions.assertArrayEquals(expectedResults, results);
    }
}
