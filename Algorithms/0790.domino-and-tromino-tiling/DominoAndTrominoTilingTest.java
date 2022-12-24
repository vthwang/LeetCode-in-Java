import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DominoAndTrominoTilingTest {
    DominoAndTrominoTiling dominoAndTrominoTiling = new DominoAndTrominoTiling();

    @Test
    void Example1() {
        int n = 3;

        Assertions.assertEquals(5, dominoAndTrominoTiling.numTilings(n));
    }

    @Test
    void Example2() {
        int n = 1;

        Assertions.assertEquals(1, dominoAndTrominoTiling.numTilings(n));
    }
}
