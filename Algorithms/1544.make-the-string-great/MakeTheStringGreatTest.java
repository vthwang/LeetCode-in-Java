import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MakeTheStringGreatTest {
    MakeTheStringGreat MakeTheStringGreat = new MakeTheStringGreat();

    @Test
    void Example1() {
        String s = "leEeetcode";
        String results = MakeTheStringGreat.makeGood(s);
        String expectedResults = "leetcode";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "abBAcC";
        String results = MakeTheStringGreat.makeGood(s);
        String expectedResults = "";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "s";
        String results = MakeTheStringGreat.makeGood(s);
        String expectedResults = "s";

        Assertions.assertEquals(expectedResults, results);
    }
}
