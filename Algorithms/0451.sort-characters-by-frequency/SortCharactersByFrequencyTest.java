import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortCharactersByFrequencyTest {
    SortCharactersByFrequency SortCharactersByFrequency = new SortCharactersByFrequency();

    @Test
    void Example1() {
        String s = "tree";
        String results = SortCharactersByFrequency.frequencySort(s);
        String expectedResults = "eert";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "cccaaa";
        String results = SortCharactersByFrequency.frequencySort(s);
        String expectedResults = "aaaccc";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "Aabb";
        String results = SortCharactersByFrequency.frequencySort(s);
        String expectedResults = "bbAa";

        Assertions.assertEquals(expectedResults, results);
    }
}
