import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountAndSayTest {
    CountAndSay CountAndSay = new CountAndSay();

    @Test
    void Example1() {
        int n = 1;
        String results = CountAndSay.countAndSay(n);
        String expectedResults = "1";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 4;
        String results = CountAndSay.countAndSay(n);
        String expectedResults = "1211";

        Assertions.assertEquals(expectedResults, results);
    }
}
