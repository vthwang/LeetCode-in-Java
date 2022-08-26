import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReorderedPowerOf2Test {
    ReorderedPowerOf2 ReorderedPowerOf2 = new ReorderedPowerOf2();

    @Test
    void Example1() {
        int n = 1;
        boolean results = ReorderedPowerOf2.reorderedPowerOf2(n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 10;
        boolean results = ReorderedPowerOf2.reorderedPowerOf2(n);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
