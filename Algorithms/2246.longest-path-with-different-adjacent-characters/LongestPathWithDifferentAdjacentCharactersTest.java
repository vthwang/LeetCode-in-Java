import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPathWithDifferentAdjacentCharactersTest {
    LongestPathWithDifferentAdjacentCharacters longestPathWithDifferentAdjacentCharacters = new LongestPathWithDifferentAdjacentCharacters();

    @Test
    void Example1() {
        int[] parent = {-1, 0, 0, 1, 1, 2};
        String s = "abacbe";

        Assertions.assertEquals(3, longestPathWithDifferentAdjacentCharacters.longestPath(parent, s));
    }

    @Test
    void Example2() {
        int[] parent = {-1, 0, 0, 0};
        String s = "aabc";

        Assertions.assertEquals(3, longestPathWithDifferentAdjacentCharacters.longestPath(parent, s));
    }
}
