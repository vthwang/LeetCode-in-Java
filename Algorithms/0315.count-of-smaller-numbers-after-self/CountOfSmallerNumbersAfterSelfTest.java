import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class CountOfSmallerNumbersAfterSelfTest {
    CountOfSmallerNumbersAfterSelf CountOfSmallerNumbersAfterSelf = new CountOfSmallerNumbersAfterSelf();

    @Test
    void Example1() {
        int[] nums = {5, 2, 6, 1};
        List<Integer> result = CountOfSmallerNumbersAfterSelf.countSmaller(nums);
        List<Integer> expectedResults = new LinkedList<>();
        expectedResults.add(2);
        expectedResults.add(1);
        expectedResults.add(1);
        expectedResults.add(0);

        Assertions.assertEquals(expectedResults, result);
    }

    @Test
    void Example2() {
        int[] nums = {-1};
        List<Integer> result = CountOfSmallerNumbersAfterSelf.countSmaller(nums);
        List<Integer> expectedResults = new LinkedList<>();
        expectedResults.add(0);

        Assertions.assertEquals(expectedResults, result);
    }

    @Test
    void Example3() {
        int[] nums = {-1, -1};
        List<Integer> result = CountOfSmallerNumbersAfterSelf.countSmaller(nums);
        List<Integer> expectedResults = new LinkedList<>();
        expectedResults.add(0);
        expectedResults.add(0);

        Assertions.assertEquals(expectedResults, result);
    }
}
