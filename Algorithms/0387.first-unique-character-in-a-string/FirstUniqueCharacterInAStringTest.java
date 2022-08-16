import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstUniqueCharacterInAStringTest {
    FirstUniqueCharacterInAString FirstUniqueCharacterInAString = new FirstUniqueCharacterInAString();

    @Test
    void Example1() {
        String s = "leetcode";
        int results = FirstUniqueCharacterInAString.firstUniqChar(s);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "loveleetcode";
        int results = FirstUniqueCharacterInAString.firstUniqChar(s);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "aabb";
        int results = FirstUniqueCharacterInAString.firstUniqChar(s);
        int expectedResults = -1;

        Assertions.assertEquals(expectedResults, results);
    }
}
