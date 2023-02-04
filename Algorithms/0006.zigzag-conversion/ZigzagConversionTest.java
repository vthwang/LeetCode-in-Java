import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZigzagConversionTest {
    ZigzagConversion zigzagConversion = new ZigzagConversion();

    @Test
    void Example1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        Assertions.assertEquals("PAHNAPLSIIGYIR", zigzagConversion.convert(s, numRows));
    }

    @Test
    void Example2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;

        Assertions.assertEquals("PINALSIGYAHRPI", zigzagConversion.convert(s, numRows));
    }

    @Test
    void Example3() {
        String s = "A";
        int numRows = 1;

        Assertions.assertEquals("A", zigzagConversion.convert(s, numRows));
    }
}
