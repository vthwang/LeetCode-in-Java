import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePairsTest {
    PalindromePairs PalindromePairs = new PalindromePairs();

    @Test
    void Example1() {
        String[] words = {"abcd","dcba","lls","s","sssll"};
        List<List<Integer>> results = PalindromePairs.palindromePairs(words);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(0, 1));
        expectedResults.add(Arrays.asList(1, 0));
        expectedResults.add(Arrays.asList(3, 2));
        expectedResults.add(Arrays.asList(2, 4));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String[] words = {"bat","tab","cat"};
        List<List<Integer>> results = PalindromePairs.palindromePairs(words);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(0, 1));
        expectedResults.add(Arrays.asList(1, 0));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String[] words = {"a",""};
        List<List<Integer>> results = PalindromePairs.palindromePairs(words);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList(1, 0));
        expectedResults.add(Arrays.asList(0, 1));

        Assertions.assertEquals(expectedResults, results);
    }
}
