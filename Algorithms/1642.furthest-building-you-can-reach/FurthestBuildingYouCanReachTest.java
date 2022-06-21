import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FurthestBuildingYouCanReachTest {
    FurthestBuildingYouCanReach FurthestBuildingYouCanReach = new FurthestBuildingYouCanReach();

    @Test
    void Example1() {
        int[] heights = {4, 2, 7, 6, 9, 14, 12};
        int bricks = 5, ladders = 1;
        int results = FurthestBuildingYouCanReach.furthestBuilding(heights, bricks, ladders);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] heights = {4, 12, 2, 7, 3, 18, 20, 3, 19};
        int bricks = 10, ladders = 2;
        int results = FurthestBuildingYouCanReach.furthestBuilding(heights, bricks, ladders);
        int expectedResults = 7;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] heights = {14, 3, 19, 3};
        int bricks = 17, ladders = 0;
        int results = FurthestBuildingYouCanReach.furthestBuilding(heights, bricks, ladders);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }
}
