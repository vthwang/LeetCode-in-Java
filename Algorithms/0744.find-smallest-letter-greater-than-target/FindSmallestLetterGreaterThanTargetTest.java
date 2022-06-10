import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindSmallestLetterGreaterThanTargetTest {
    FindSmallestLetterGreaterThanTarget FindSmallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();

    @Test
    void Example1() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char results = FindSmallestLetterGreaterThanTarget.nextGreatestLetter(letters, target);
        char expectedResults = 'c';

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char results = FindSmallestLetterGreaterThanTarget.nextGreatestLetter(letters, target);
        char expectedResults = 'f';

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        char[] letters = {'c', 'f', 'j'};
        char target = 'd';
        char results = FindSmallestLetterGreaterThanTarget.nextGreatestLetter(letters, target);
        char expectedResults = 'f';

        Assertions.assertEquals(expectedResults, results);
    }
}
