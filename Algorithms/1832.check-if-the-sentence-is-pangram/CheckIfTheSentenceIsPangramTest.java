import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckIfTheSentenceIsPangramTest {
    CheckIfTheSentenceIsPangram CheckIfTheSentenceIsPangram = new CheckIfTheSentenceIsPangram();

    @Test
    void Example1() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean results = CheckIfTheSentenceIsPangram.checkIfPangram(sentence);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String sentence = "leetcode";
        boolean results = CheckIfTheSentenceIsPangram.checkIfPangram(sentence);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }
}
