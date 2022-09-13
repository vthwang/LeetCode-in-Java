import java.util.Arrays;

class BagOfTokens2 {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0, right = tokens.length - 1, points = 0, res = 0;
        while (left <= right && (power >= tokens[left] || points > 0)) {
            while (left <= right && power >= tokens[left]) {
                power -= tokens[left++];
                points++;
            }
            res = Math.max(res, points);
            if (left <= right && points > 0) {
                power += tokens[right--];
                points--;
            }
        }
        return res;
    }
}