import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbersTest {
    PartitioningIntoMinimumNumberOfDeciBinaryNumbers PartitioningIntoMinimumNumberOfDeciBinaryNumbers = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();

    @Test
    void Example1() {
        String n = "32";
        int results = PartitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String n = "82734";
        int results = PartitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n);
        int expectedResults = 8;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String n = "27346209830709182346";
        int results = PartitioningIntoMinimumNumberOfDeciBinaryNumbers.minPartitions(n);
        int expectedResults = 9;

        Assertions.assertEquals(expectedResults, results);
    }
}
