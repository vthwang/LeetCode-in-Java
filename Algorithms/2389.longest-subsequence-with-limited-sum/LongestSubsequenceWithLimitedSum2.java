import java.util.Arrays;

class LongestSubsequenceWithLimitedSum2 {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];

        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int index = binarySearch(nums, queries[i]);
            ans[i] = index;
        }
        return ans;
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid + 1;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return nums[left] > target ? left : left + 1;
    }
}