import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumGeneticMutationTest {
    MinimumGeneticMutation MinimumGeneticMutation = new MinimumGeneticMutation();

    @Test
    void Example1() {
        String start = "AACCGGTT", end = "AACCGGTA";
        String[] bank = {"AACCGGTA"};
        int results = MinimumGeneticMutation.minMutation(start, end, bank);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String start = "AACCGGTT", end = "AAACGGTA";
        String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        int results = MinimumGeneticMutation.minMutation(start, end, bank);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String start = "AAAAACCC", end = "AACCCCCC";
        String[] bank = {"AAAACCCC", "AAACCCCC", "AACCCCCC"};
        int results = MinimumGeneticMutation.minMutation(start, end, bank);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);
    }
}
