import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumPerformanceOfATeamTest {
    MaximumPerformanceOfATeam MaximumPerformanceOfATeam = new MaximumPerformanceOfATeam();

    @Test
    void Example1() {
        int n = 6, k = 2;
        int[] speed = {2, 10, 3, 1, 5, 8},  efficiency = {5, 4, 3, 9, 7, 2};
        int results = MaximumPerformanceOfATeam.maxPerformance(n, speed, efficiency, k);
        int expectedResults = 60;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 6, k = 3;
        int[] speed = {2, 10, 3, 1, 5, 8},  efficiency = {5, 4, 3, 9, 7, 2};
        int results = MaximumPerformanceOfATeam.maxPerformance(n, speed, efficiency, k);
        int expectedResults = 68;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int n = 6, k = 4;
        int[] speed = {2, 10, 3, 1, 5, 8},  efficiency = {5, 4, 3, 9, 7, 2};
        int results = MaximumPerformanceOfATeam.maxPerformance(n, speed, efficiency, k);
        int expectedResults = 72;

        Assertions.assertEquals(expectedResults, results);
    }
}
