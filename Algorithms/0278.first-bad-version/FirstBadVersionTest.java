import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstBadVersionTest {
    FirstBadVersion FirstBadVersion = new FirstBadVersion();

    @Test
    void Example1() {
        int n = 5;
        int results = FirstBadVersion.firstBadVersion(n);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 1;
        int results = FirstBadVersion.firstBadVersion(n);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }
}
