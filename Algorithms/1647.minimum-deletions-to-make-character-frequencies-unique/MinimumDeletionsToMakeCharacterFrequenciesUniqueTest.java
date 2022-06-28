import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumDeletionsToMakeCharacterFrequenciesUniqueTest {
    MinimumDeletionsToMakeCharacterFrequenciesUnique MinimumDeletionsToMakeCharacterFrequenciesUnique = new MinimumDeletionsToMakeCharacterFrequenciesUnique();

    @Test
    void Example1() {
        String n = "aab";
        int results = MinimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions(n);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String n = "aaabbbcc";
        int results = MinimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions(n);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String n = "ceabaacb";
        int results = MinimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions(n);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }
}
