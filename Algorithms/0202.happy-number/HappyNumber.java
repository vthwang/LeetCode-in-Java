import java.util.HashMap;
import java.util.Map;

class HappyNumber {
    private int happyNumber(int n) {
        int res = 0;
        while (n > 0) {
            int num = n % 10;
            res += num * num;
            n /= 10;
        }
        return res;
    }

    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        int happyNumber = n;
        map.put(happyNumber, 1);
        while (happyNumber != 0 && happyNumber != 1) {
            happyNumber = happyNumber(happyNumber);
            if (map.containsKey(happyNumber)) {
                return false;
            } else {
                map.put(happyNumber, 1);
            }
        }
        return happyNumber == 1;
    }
}