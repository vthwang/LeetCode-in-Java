import java.util.*;

class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num: nums1) {
            set1.add(num);
        }
        for (int num: nums2) {
            set2.add(num);
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> answer1 = new ArrayList<>();
        for (int num: set1) {
            if (!set2.contains(num)) {
                answer1.add(num);
            }
        }
        List<Integer> answer2 = new ArrayList<>();
        for (int num: set2) {
            if (!set1.contains(num)) {
                answer2.add(num);
            }
        }
        res.add(answer1);
        res.add(answer2);
        return res;
    }
}