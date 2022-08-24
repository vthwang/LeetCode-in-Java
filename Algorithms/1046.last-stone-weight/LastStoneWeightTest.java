import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LastStoneWeightTest {
    LastStoneWeight LastStoneWeight = new LastStoneWeight();

    @Test
    void Example1() {
        int[] stones = {2, 7, 4, 1, 8, 1};
        int results = LastStoneWeight.lastStoneWeight(stones);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] stones = {1};
        int results = LastStoneWeight.lastStoneWeight(stones);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
