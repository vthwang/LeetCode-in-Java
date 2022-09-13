import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MostStonesRemovedWithSameRowOrColumnTest {
    MostStonesRemovedWithSameRowOrColumn MostStonesRemovedWithSameRowOrColumn = new MostStonesRemovedWithSameRowOrColumn();

    @Test
    void Example1() {
        int[][] stones = {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}};
        int results = MostStonesRemovedWithSameRowOrColumn.removeStones(stones);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[][] stones = {{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}};
        int results = MostStonesRemovedWithSameRowOrColumn.removeStones(stones);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[][] stones = {{0, 0}};
        int results = MostStonesRemovedWithSameRowOrColumn.removeStones(stones);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
