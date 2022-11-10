import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveAllAdjacentDuplicatesInStringTest {
    RemoveAllAdjacentDuplicatesInString RemoveAllAdjacentDuplicatesInString = new RemoveAllAdjacentDuplicatesInString();

    @Test
    void Example1() {
        String s = "abbaca";
        String results = RemoveAllAdjacentDuplicatesInString.removeDuplicates(s);
        String expectedResults = "ca";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "azxxzy";
        String results = RemoveAllAdjacentDuplicatesInString.removeDuplicates(s);
        String expectedResults = "ay";

        Assertions.assertEquals(expectedResults, results);
    }
}
