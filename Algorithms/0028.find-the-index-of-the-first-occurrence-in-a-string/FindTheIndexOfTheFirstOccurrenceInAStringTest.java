import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    FindTheIndexOfTheFirstOccurrenceInAString findTheIndexOfTheFirstOccurrenceInAString = new FindTheIndexOfTheFirstOccurrenceInAString();

    @Test
    void Example1() {
        String haystack = "sadbutsad", needle = "sad";

        Assertions.assertEquals(0, findTheIndexOfTheFirstOccurrenceInAString.strStr(haystack, needle));
    }

    @Test
    void Example2() {
        String haystack = "leetcode", needle = "leeto";

        Assertions.assertEquals(-1, findTheIndexOfTheFirstOccurrenceInAString.strStr(haystack, needle));
    }
}
