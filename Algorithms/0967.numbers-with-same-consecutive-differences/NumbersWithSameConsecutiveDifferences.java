import java.util.ArrayList;
import java.util.List;

class NumbersWithSameConsecutiveDifferences {
    private void DFS(int n, int num, int k, List<Integer> results) {
        if (n == 0) {
            results.add(num);
            return;
        }
        List<Integer> nextDigits = new ArrayList<>();
        int tailDigit = num % 10;
        nextDigits.add(tailDigit + k);
        if (k != 0) nextDigits.add(tailDigit - k);
        for (Integer nextDigit : nextDigits) {
            if (nextDigit >= 0 && nextDigit < 10) {
                int newNum = num * 10 + nextDigit;
                DFS(n - 1, newNum, k, results);
            }
        }
    }

    public int[] numsSameConsecDiff(int n, int k) {
        if (n == 1) return new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> res = new ArrayList<>();
        for (int num = 1; num < 10; num++) {
            DFS(n - 1, num, k, res);
        }

        return res.stream().mapToInt(i->i).toArray();
    }
}