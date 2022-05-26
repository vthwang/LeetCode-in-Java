import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {
    ContainsDuplicate ContainsDuplicate = new ContainsDuplicate();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3, 1};

        boolean results = ContainsDuplicate.containsDuplicate(nums);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 2, 3, 4};

        boolean results = ContainsDuplicate.containsDuplicate(nums);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        boolean results = ContainsDuplicate.containsDuplicate(nums);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }
}
