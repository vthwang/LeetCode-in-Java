import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountVowelsPermutationTest {
    CountVowelsPermutation CountVowelsPermutation = new CountVowelsPermutation();

    @Test
    void Example1() {
        int n = 1;
        int results = CountVowelsPermutation.countVowelPermutation(n);
        int expectedResults = 5;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int n = 2;
        int results = CountVowelsPermutation.countVowelPermutation(n);
        int expectedResults = 10;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int n = 5;
        int results = CountVowelsPermutation.countVowelPermutation(n);
        int expectedResults = 68;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        int n = 144;
        int results = CountVowelsPermutation.countVowelPermutation(n);
        int expectedResults = 18208803;

        Assertions.assertEquals(expectedResults, results);
    }
}
