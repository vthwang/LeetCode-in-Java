import java.util.ArrayList;
import java.util.List;

class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int low = 0, high = arr.length - 1;
        while (high - low >= k) {
            int diffLow = Math.abs(arr[low] - x);
            int diffHigh = Math.abs(arr[high] - x);
            if (diffLow <= diffHigh) high--;
            else low++;
        }
        while (low <= high) res.add(arr[low++]);
        return res;
    }
}