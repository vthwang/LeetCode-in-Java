import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    RemoveDuplicatesFromSortedArray RemoveDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void Example1() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};

        int k = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        for (int i = 0; i < k; i++) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    void Example2() {
        int[] nums = {1, 1, 2};
        int results = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int results = RemoveDuplicatesFromSortedArray.removeDuplicates(nums);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }
}
