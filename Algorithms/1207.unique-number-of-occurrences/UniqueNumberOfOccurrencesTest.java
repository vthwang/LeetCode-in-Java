import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniqueNumberOfOccurrencesTest {
    UniqueNumberOfOccurrences uniqueNumberOfOccurrences = new UniqueNumberOfOccurrences();

    @Test
    void Example1() {
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean results = uniqueNumberOfOccurrences.uniqueOccurrences(arr);

        Assertions.assertTrue(results);
    }

    @Test
    void Example2() {
        int[] arr = {1, 2};
        boolean results = uniqueNumberOfOccurrences.uniqueOccurrences(arr);

        Assertions.assertFalse(results);
    }

    @Test
    void Example3() {
        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        boolean results = uniqueNumberOfOccurrences.uniqueOccurrences(arr);

        Assertions.assertTrue(results);
    }
}
