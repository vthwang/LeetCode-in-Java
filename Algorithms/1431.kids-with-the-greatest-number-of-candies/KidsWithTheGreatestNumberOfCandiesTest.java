import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandiesTest {
    KidsWithTheGreatestNumberOfCandies kidsWithTheGreatestNumberOfCandies = new KidsWithTheGreatestNumberOfCandies();

    @Test
    void Example1() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> expectedResults = Arrays.asList(true, true, true, false, true);
        Assertions.assertEquals(expectedResults, kidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void Example2() {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;

        List<Boolean> expectedResults = Arrays.asList(true, false, false, false, false);
        Assertions.assertEquals(expectedResults, kidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void Example3() {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;

        List<Boolean> expectedResults = Arrays.asList(true, false, true);
        Assertions.assertEquals(expectedResults, kidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies));
    }
}
