import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Maximum69NumberTest {
    Maximum69Number Maximum69Number = new Maximum69Number();

    @Test
    void Example1() {
        int num = 9669;
        int results = Maximum69Number.maximum69Number(num);
        int expectedResults = 9969;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int num = 9996;
        int results = Maximum69Number.maximum69Number(num);
        int expectedResults = 9999;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int num = 9999;
        int results = Maximum69Number.maximum69Number(num);
        int expectedResults = 9999;

        Assertions.assertEquals(expectedResults, results);
    }
}
