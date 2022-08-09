import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class BinaryTreesWithFactors {
    private final int mod = (int) (Math.pow(10, 9) + 7);

    public int numFactoredBinaryTrees(int[] arr) {
        if (arr.length == 0) return 0;

        Arrays.sort(arr);
        Map<Integer, Long> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            long count = 1L;
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0 && map.containsKey(arr[i] / arr[j])) {
                    count += map.get(arr[j]) * map.get(arr[i] / arr[j]);
                }
            }
            map.put(arr[i], count);
        }

        long totalCount = 0L;
        for (Map.Entry<Integer, Long> entry : map.entrySet()) {
            totalCount += entry.getValue();
        }

        return (int) (totalCount % mod);
    }
}