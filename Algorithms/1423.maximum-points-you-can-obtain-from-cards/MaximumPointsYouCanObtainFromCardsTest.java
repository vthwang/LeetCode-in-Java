import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumPointsYouCanObtainFromCardsTest {
    MaximumPointsYouCanObtainFromCards MaximumPointsYouCanObtainFromCards = new MaximumPointsYouCanObtainFromCards();

    @Test
    void Example1() {
        int[] target = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        int results = MaximumPointsYouCanObtainFromCards.maxScore(target, k);
        int expectedResults = 12;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] target = {2, 2, 2};
        int k = 2;
        int results = MaximumPointsYouCanObtainFromCards.maxScore(target, k);
        int expectedResults = 4;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example() {
        int[] target = {9, 7, 7, 9, 7, 7, 9};
        int k = 7;
        int results = MaximumPointsYouCanObtainFromCards.maxScore(target, k);
        int expectedResults = 55;

        Assertions.assertEquals(expectedResults, results);
    }
}
