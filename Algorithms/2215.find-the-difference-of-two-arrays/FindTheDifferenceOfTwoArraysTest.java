import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheDifferenceOfTwoArraysTest {
    FindTheDifferenceOfTwoArrays findTheDifferenceOfTwoArrays = new FindTheDifferenceOfTwoArrays();

    @Test
    void Example1() {
        int[] nums1 = {1, 2, 3}, nums2 = {2, 4, 6};

        List<List<Integer>> results = new ArrayList<>();
        results.add(Arrays.asList(1, 3));
        results.add(Arrays.asList(4, 6));
        Assertions.assertEquals(results, findTheDifferenceOfTwoArrays.findDifference(nums1, nums2));
    }

    @Test
    void Example2() {
        int[] nums1 = {1, 2, 3, 3}, nums2 = {1, 1, 2, 2};

        List<List<Integer>> results = new ArrayList<>();
        results.add(List.of(3));
        results.add(new ArrayList<>());
        Assertions.assertEquals(results, findTheDifferenceOfTwoArrays.findDifference(nums1, nums2));
    }
}
