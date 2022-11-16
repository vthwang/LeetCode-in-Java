public class GuessGame {
    private int n = 0;

    void init(int pick) {
        n = pick;
    }

    int guess(int num) {
        return Integer.compare(n, num);
    }
}
