import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DetermineIfStringHalvesAreAlikeTest {
    DetermineIfStringHalvesAreAlike determineIfStringHalvesAreAlike = new DetermineIfStringHalvesAreAlike();

    @Test
    void Example1() {
        String s = "book";
        boolean results = determineIfStringHalvesAreAlike.halvesAreAlike(s);

        Assertions.assertTrue(results);
    }

    @Test
    void Example2() {
        String s = "textbook";
        boolean results = determineIfStringHalvesAreAlike.halvesAreAlike(s);

        Assertions.assertFalse(results);
    }
}
