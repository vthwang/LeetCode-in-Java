import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartitioningTest {
    PalindromePartitioning palindromePartitioning = new PalindromePartitioning();

    @Test
    void Example1() {
        String s = "aab";
        List<List<String>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList("a", "a", "b"));
        expectedResults.add(Arrays.asList("aa", "b"));

        Assertions.assertEquals(expectedResults, palindromePartitioning.partition(s));
    }

    @Test
    void Example2() {
        String s = "a";
        List<List<String>> expectedResults = new ArrayList<>();
        expectedResults.add(List.of("a"));

        Assertions.assertEquals(expectedResults, palindromePartitioning.partition(s));
    }
}
