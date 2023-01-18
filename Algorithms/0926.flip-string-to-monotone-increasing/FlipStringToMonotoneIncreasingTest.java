import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlipStringToMonotoneIncreasingTest {
    FlipStringToMonotoneIncreasing flipStringToMonotoneIncreasing = new FlipStringToMonotoneIncreasing();

    @Test
    void Example1() {
        String s = "00110";

        Assertions.assertEquals(1, flipStringToMonotoneIncreasing.minFlipsMonoIncr(s));
    }

    @Test
    void Example2() {
        String s = "010110";

        Assertions.assertEquals(2, flipStringToMonotoneIncreasing.minFlipsMonoIncr(s));
    }

    @Test
    void Example3() {
        String s = "00011000";

        Assertions.assertEquals(2, flipStringToMonotoneIncreasing.minFlipsMonoIncr(s));
    }
}
