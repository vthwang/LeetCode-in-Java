import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BagOfTokensTest {
    BagOfTokens BagOfTokens = new BagOfTokens();
    BagOfTokens2 BagOfTokens2 = new BagOfTokens2();

    @Test
    void Example1() {
        int[] tokens = {100};
        int power = 50;
        int results = BagOfTokens.bagOfTokensScore(tokens, power);
        int expectedResults = 0;

        Assertions.assertEquals(expectedResults, results);

        results = BagOfTokens2.bagOfTokensScore(tokens, power);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] tokens = {100, 200};
        int power = 150;
        int results = BagOfTokens.bagOfTokensScore(tokens, power);
        int expectedResults = 1;

        Assertions.assertEquals(expectedResults, results);

        results = BagOfTokens2.bagOfTokensScore(tokens, power);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] tokens = {100, 200, 300, 400};
        int power = 200;
        int results = BagOfTokens.bagOfTokensScore(tokens, power);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);

        results = BagOfTokens2.bagOfTokensScore(tokens, power);
        Assertions.assertEquals(expectedResults, results);
    }
}
