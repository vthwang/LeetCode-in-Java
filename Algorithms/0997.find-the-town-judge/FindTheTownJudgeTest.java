import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheTownJudgeTest {
    FindTheTownJudge findTheTownJudge = new FindTheTownJudge();

    @Test
    void Example1() {
        int n = 2;
        int[][] trust = {{1 ,2}};

        Assertions.assertEquals(2, findTheTownJudge.findJudge(n, trust));
    }

    @Test
    void Example2() {
        int n = 3;
        int[][] trust = {{1 ,3}, {2, 3}};

        Assertions.assertEquals(3, findTheTownJudge.findJudge(n, trust));
    }

    @Test
    void Example3() {
        int n = 3;
        int[][] trust = {{1 ,3}, {2, 3}, {3, 1}};

        Assertions.assertEquals(-1, findTheTownJudge.findJudge(n, trust));
    }
}
