import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {
    HappyNumber HappyNumber = new HappyNumber();

    @Test
    void Example1() {
        int n = 19;
        boolean results = HappyNumber.isHappy(n);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 2;
        boolean results = HappyNumber.isHappy(n);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
