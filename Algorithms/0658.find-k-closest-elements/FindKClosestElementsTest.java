import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKClosestElementsTest {
    FindKClosestElements FindKClosestElements = new FindKClosestElements();

    @Test
    void Example1() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4, x = 3;
        List<Integer> results = FindKClosestElements.findClosestElements(arr, k, x);
        List<Integer> expectedResults = Arrays.asList(1, 2, 3, 4);

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4, x = -1;
        List<Integer> results = FindKClosestElements.findClosestElements(arr, k, x);
        List<Integer> expectedResults = Arrays.asList(1, 2, 3, 4);

        Assertions.assertEquals(expectedResults, results);
    }
}
