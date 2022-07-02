import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCutsTest {
    MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts = new MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts();

    @Test
    void Example1() {
        int h = 5, w = 4;
        int[] horizontalCuts = {1, 2, 4}, verticalCuts = {1, 3};
        int results = MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts.maxArea(h, w, horizontalCuts, verticalCuts);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int h = 5, w = 4;
        int[] horizontalCuts = {3, 1},  verticalCuts = {1};
        int results = MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts.maxArea(h, w, horizontalCuts, verticalCuts);
        int expectedResults = 6;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int h = 5, w = 4;
        int[] horizontalCuts = {3}, verticalCuts = {3};
        int results = MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts.maxArea(h, w, horizontalCuts, verticalCuts);
        int expectedResults = 9;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        int h = 1000000000, w = 1000000000;
        int[] horizontalCuts = {2}, verticalCuts = {2};
        int results = MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts.maxArea(h, w, horizontalCuts, verticalCuts);
        int expectedResults = 81;

        Assertions.assertEquals(expectedResults, results);
    }
}
