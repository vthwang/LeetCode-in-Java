import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitionEqualSubsetSumTest {
    PartitionEqualSubsetSum PartitionEqualSubsetSum = new PartitionEqualSubsetSum();

    @Test
    void Example1() {
        int[] nums = {1, 5, 11, 5};
        boolean results = PartitionEqualSubsetSum.canPartition(nums);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {1, 2, 3, 5};
        boolean results = PartitionEqualSubsetSum.canPartition(nums);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
