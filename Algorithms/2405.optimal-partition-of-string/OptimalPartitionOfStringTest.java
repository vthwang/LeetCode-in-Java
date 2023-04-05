import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OptimalPartitionOfStringTest {
    OptimalPartitionOfString optimalPartitionOfString = new OptimalPartitionOfString();

    @Test
    void Example1() {
        String s = "abacaba";

        Assertions.assertEquals(4, optimalPartitionOfString.partitionString(s));
    }

    @Test
    void Example2() {
        String s = "ssssss";

        Assertions.assertEquals(6, optimalPartitionOfString.partitionString(s));
    }
}
