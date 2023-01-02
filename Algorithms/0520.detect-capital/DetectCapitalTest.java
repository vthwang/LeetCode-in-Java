import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DetectCapitalTest {
    DetectCapital detectCapital = new DetectCapital();

    @Test
    void Example1() {
        String word = "USA";

        Assertions.assertTrue(detectCapital.detectCapitalUse(word));
    }

    @Test
    void Example2() {
        String word = "FlaG";

        Assertions.assertFalse(detectCapital.detectCapitalUse(word));
    }

    @Test
    void Example3() {
        String word = "g";

        Assertions.assertFalse(detectCapital.detectCapitalUse(word));
    }
}
