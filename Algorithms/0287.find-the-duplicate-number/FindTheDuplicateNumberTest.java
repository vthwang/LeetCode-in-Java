import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheDuplicateNumberTest {
    FindTheDuplicateNumber FindTheDuplicateNumber = new FindTheDuplicateNumber();
    FindTheDuplicateNumber2 FindTheDuplicateNumber2 = new FindTheDuplicateNumber2();

    @Test
    void Example1() {
        int[] nums = {1, 3, 4, 2, 2};

        int results = FindTheDuplicateNumber.findDuplicate(nums);
        int expectedResults = 2;

        Assertions.assertEquals(expectedResults, results);

        results = FindTheDuplicateNumber2.findDuplicate(nums);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] nums = {3, 1, 3, 4, 2};

        int results = FindTheDuplicateNumber.findDuplicate(nums);
        int expectedResults = 3;

        Assertions.assertEquals(expectedResults, results);

        results = FindTheDuplicateNumber2.findDuplicate(nums);
        Assertions.assertEquals(expectedResults, results);
    }
}
