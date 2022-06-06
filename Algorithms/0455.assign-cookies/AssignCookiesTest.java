import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssignCookiesTest {
    AssignCookies AssignCookies = new AssignCookies();

    @Test
    void Example1() {
        int[] g = {1, 2, 3}, s = {1, 1};
        int results = AssignCookies.findContentChildren(g, s);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] g = {1, 2}, s = {1, 2, 3};
        int results = AssignCookies.findContentChildren(g, s);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
