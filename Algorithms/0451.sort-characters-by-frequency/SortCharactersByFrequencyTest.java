import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortCharactersByFrequencyTest {
    SortCharactersByFrequency sortCharactersByFrequency = new SortCharactersByFrequency();
    SortCharactersByFrequency2 sortCharactersByFrequency2 = new SortCharactersByFrequency2();

    @Test
    void Example1() {
        String s = "tree";
        String results = sortCharactersByFrequency.frequencySort(s);
        String expectedResults = "eert";

        Assertions.assertEquals(expectedResults, results);

        results = sortCharactersByFrequency2.frequencySort(s);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "cccaaa";
        String results = sortCharactersByFrequency.frequencySort(s);
        String expectedResults = "aaaccc";

        Assertions.assertEquals(expectedResults, results);

        results = sortCharactersByFrequency2.frequencySort(s);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "Aabb";
        String results = sortCharactersByFrequency.frequencySort(s);
        String expectedResults = "bbAa";

        Assertions.assertEquals(expectedResults, results);

        results = sortCharactersByFrequency2.frequencySort(s);
        Assertions.assertEquals(expectedResults, results);
    }
}
