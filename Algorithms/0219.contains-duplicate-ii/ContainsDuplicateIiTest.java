import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateIiTest {
    ContainsDuplicateIi ContainsDuplicateIi = new ContainsDuplicateIi();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean results = ContainsDuplicateIi.containsNearbyDuplicate(nums, k);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        boolean results = ContainsDuplicateIi.containsNearbyDuplicate(nums, k);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean results = ContainsDuplicateIi.containsNearbyDuplicate(nums, k);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
