import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Dota2SenateTest {
    Dota2Senate dota2Senate = new Dota2Senate();

    @Test
    void Example1() {
        String senate = "RD";

        Assertions.assertEquals("Radiant", dota2Senate.predictPartyVictory(senate));
    }

    @Test
    void Example2() {
        String senate = "RDD";

        Assertions.assertEquals("Dire", dota2Senate.predictPartyVictory(senate));
    }
}
