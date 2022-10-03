import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumTimeToMakeRopeColorfulTest {
    MinimumTimeToMakeRopeColorful MinimumTimeToMakeRopeColorful = new MinimumTimeToMakeRopeColorful();

    @Test
    void Example1() {
        String colors = "abaac";
        int[] neededTime = {1, 2, 3, 4, 5};
        int results = MinimumTimeToMakeRopeColorful.minCost(colors, neededTime);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String colors = "abc";
        int[] neededTime = {1, 2, 3};
        int results = MinimumTimeToMakeRopeColorful.minCost(colors, neededTime);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String colors = "aabaa";
        int[] neededTime = {1, 2, 3, 4, 1};
        int results = MinimumTimeToMakeRopeColorful.minCost(colors, neededTime);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
