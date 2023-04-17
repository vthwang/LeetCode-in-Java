import java.util.ArrayList;
import java.util.List;

class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatestCandies = 0;
        for (int candy: candies) {
            if (candy > greatestCandies) {
                greatestCandies = candy;
            }
        }
        List<Boolean> res = new ArrayList<>();
        for (int candy: candies) {
            if (candy + extraCandies >= greatestCandies) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}