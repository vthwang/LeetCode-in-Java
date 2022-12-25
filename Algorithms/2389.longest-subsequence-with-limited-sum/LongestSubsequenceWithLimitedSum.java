import java.util.Arrays;

class LongestSubsequenceWithLimitedSum {
    public int[] answerQueries(int[] nums, int[] queries) {
        int m = queries.length;
        int[] ans = new int[m];
        Arrays.sort(nums);

        for (int i = 0; i < m; i++) {
            int count = 0, query = queries[i];
            for (int num : nums) {
                if (query >= num) {
                    count++;
                    query -= num;
                } else
                    break;
            }
            ans[i] = count;
        }
        return ans;
    }
}