import java.util.Arrays;

class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0, right = tokens.length - 1, res = 0;
        while (left <= right) {
            if (tokens[left] <= power) {
                power -= tokens[left];
                res++;
                left++;
            } else {
                if (left != right && res > 0) {
                    power += tokens[right];
                    res--;
                    right--;
                } else {
                    break;
                }
            }
        }
        return res;
    }
}