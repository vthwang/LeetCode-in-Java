import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberComplementTest {
    NumberComplement NumberComplement = new NumberComplement();

    @Test
    void Example1() {
        int num = 5;
        int results = NumberComplement.findComplement(num);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int num = 1;
        int results = NumberComplement.findComplement(num);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }
}
