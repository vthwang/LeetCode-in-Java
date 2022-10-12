import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncreasingTripletSubsequenceTest {
    IncreasingTripletSubsequence IncreasingTripletSubsequence = new IncreasingTripletSubsequence();

    @Test
    void Example1() {
        int[] nums = {1, 2, 3, 4, 5};
        boolean results = IncreasingTripletSubsequence.increasingTriplet(nums);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {5, 4, 3, 2, 1};
        boolean results = IncreasingTripletSubsequence.increasingTriplet(nums);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] nums = {2, 1, 5, 0, 4, 6};
        boolean results = IncreasingTripletSubsequence.increasingTriplet(nums);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }
}
