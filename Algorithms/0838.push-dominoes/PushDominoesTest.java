import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PushDominoesTest {
    PushDominoes PushDominoes = new PushDominoes();

    @Test
    void Example1() {
        String dominoes = "RR.L";
        String results = PushDominoes.pushDominoes(dominoes);
        String expectedResults = "RR.L";

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String dominoes = ".L.R...LR..L..";
        String results = PushDominoes.pushDominoes(dominoes);
        String expectedResults = "LL.RR.LLRRLL..";

        Assertions.assertEquals(expectedResults, results);
    }
}
