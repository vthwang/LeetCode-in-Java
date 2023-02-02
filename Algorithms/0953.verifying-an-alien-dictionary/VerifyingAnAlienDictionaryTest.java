import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerifyingAnAlienDictionaryTest {
    VerifyingAnAlienDictionary verifyingAnAlienDictionary = new VerifyingAnAlienDictionary();

    @Test
    void Example1() {
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        Assertions.assertTrue(verifyingAnAlienDictionary.isAlienSorted(words, order));
    }

    @Test
    void Example2() {
        String[] words = {"word", "world", "row"};
        String order = "worldabcefghijkmnpqstuvxyz";

        Assertions.assertFalse(verifyingAnAlienDictionary.isAlienSorted(words, order));
    }

    @Test
    void Example3() {
        String[] words = {"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";

        Assertions.assertFalse(verifyingAnAlienDictionary.isAlienSorted(words, order));
    }
}
