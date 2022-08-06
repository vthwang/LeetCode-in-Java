import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PoorPigsTest {
    PoorPigs PoorPigs = new PoorPigs();

    @Test
    void Example1() {
        int buckets = 1000, minutesToDie = 15, minutesToTest = 60;
        int results = PoorPigs.poorPigs(buckets, minutesToDie, minutesToTest);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int buckets = 4, minutesToDie = 15, minutesToTest = 15;
        int results = PoorPigs.poorPigs(buckets, minutesToDie, minutesToTest);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int buckets = 4, minutesToDie = 15, minutesToTest = 30;
        int results = PoorPigs.poorPigs(buckets, minutesToDie, minutesToTest);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        int buckets = 1, minutesToDie = 1, minutesToTest = 1;
        int results = PoorPigs.poorPigs(buckets, minutesToDie, minutesToTest);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
