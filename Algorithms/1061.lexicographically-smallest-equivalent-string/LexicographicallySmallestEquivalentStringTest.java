import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LexicographicallySmallestEquivalentStringTest {
    LexicographicallySmallestEquivalentString lexicographicallySmallestEquivalentString = new LexicographicallySmallestEquivalentString();

    @Test
    void Example1() {
        String s1 = "parker", s2 = "morris", baseStr = "parser";

        Assertions.assertEquals("makkek", lexicographicallySmallestEquivalentString.smallestEquivalentString(s1, s2, baseStr));
    }

    @Test
    void Example2() {
        String s1 = "hello", s2 = "world", baseStr = "hold";

        Assertions.assertEquals("hdld", lexicographicallySmallestEquivalentString.smallestEquivalentString(s1, s2, baseStr));
    }

    @Test
    void Example3() {
        String s1 = "leetcode", s2 = "programs", baseStr = "sourcecode";

        Assertions.assertEquals("aauaaaaada", lexicographicallySmallestEquivalentString.smallestEquivalentString(s1, s2, baseStr));
    }
}
