import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConstructTargetArrayWithMultipleSumsTest {
    ConstructTargetArrayWithMultipleSums ConstructTargetArrayWithMultipleSums = new ConstructTargetArrayWithMultipleSums();
    ConstructTargetArrayWithMultipleSums2 ConstructTargetArrayWithMultipleSums2 = new ConstructTargetArrayWithMultipleSums2();

    @Test
    void Example1() {
        int[] target = {9, 3, 5};
        boolean results = ConstructTargetArrayWithMultipleSums.isPossible(target);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);

        results = ConstructTargetArrayWithMultipleSums2.isPossible(target);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] target = {1, 1, 1, 2};
        boolean results = ConstructTargetArrayWithMultipleSums.isPossible(target);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);

        results = ConstructTargetArrayWithMultipleSums2.isPossible(target);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        int[] target = {8, 5};
        boolean results = ConstructTargetArrayWithMultipleSums.isPossible(target);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);

        results = ConstructTargetArrayWithMultipleSums2.isPossible(target);
        Assertions.assertEquals(expectedResults, results);
    }
}
