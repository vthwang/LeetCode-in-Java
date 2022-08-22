import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAStringTest {
    FindAllAnagramsInAString FindAllAnagramsInAString = new FindAllAnagramsInAString();

    @Test
    void Example1() {
        String s = "cbaebabacd", p = "abc";
        List<Integer> results = FindAllAnagramsInAString.findAnagrams(s, p);
        List<Integer> expectedResults = Arrays.asList(0, 6);

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "abab", p = "ab";
        List<Integer> results = FindAllAnagramsInAString.findAnagrams(s, p);
        List<Integer> expectedResults = Arrays.asList(0, 1, 2);

        Assertions.assertEquals(expectedResults, results);
    }
}
