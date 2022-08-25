import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RansomNoteTest {
    RansomNote RansomNote = new RansomNote();

    @Test
    void Example1() {
        String ransomNote = "a", magazine = "b";
        boolean results = RansomNote.canConstruct(ransomNote, magazine);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String ransomNote = "aa", magazine = "ab";
        boolean results = RansomNote.canConstruct(ransomNote, magazine);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String ransomNote = "aa", magazine = "aab";
        boolean results = RansomNote.canConstruct(ransomNote, magazine);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }
}
