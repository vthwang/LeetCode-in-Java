import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Utf8ValidationTest {
    Utf8Validation Utf8Validation = new Utf8Validation();

    @Test
    void Example1() {
        int[] data = {197, 130, 1};
        boolean results = Utf8Validation.validUtf8(data);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] data = {235, 140, 4};
        boolean results = Utf8Validation.validUtf8(data);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
