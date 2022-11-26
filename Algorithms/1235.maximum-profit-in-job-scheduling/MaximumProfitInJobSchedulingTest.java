import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumProfitInJobSchedulingTest {
    MaximumProfitInJobScheduling maximumProfitInJobScheduling = new MaximumProfitInJobScheduling();

    @Test
    void Example1() {
        int[] startTime = {1, 2, 3, 3},  endTime = {3, 4, 5, 6},  profit = {50, 10, 40, 70};
        int results = maximumProfitInJobScheduling.jobScheduling(startTime, endTime, profit);

        Assertions.assertEquals(120, results);
    }

    @Test
    void Example2() {
        int[] startTime = {1, 2, 3, 4, 6},  endTime = {3, 5, 10, 6, 9},  profit = {20, 20, 100, 70, 60};
        int results = maximumProfitInJobScheduling.jobScheduling(startTime, endTime, profit);

        Assertions.assertEquals(150, results);
    }

    @Test
    void Example3() {
        int[] startTime = {1, 1, 1},  endTime = {2, 3, 4},  profit = {5, 6, 4};
        int results = maximumProfitInJobScheduling.jobScheduling(startTime, endTime, profit);

        Assertions.assertEquals(6, results);
    }
}
