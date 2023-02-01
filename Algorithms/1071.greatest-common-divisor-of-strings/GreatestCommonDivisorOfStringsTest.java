import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreatestCommonDivisorOfStringsTest {
    GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings = new GreatestCommonDivisorOfStrings();
    GreatestCommonDivisorOfStrings2 greatestCommonDivisorOfStrings2 = new GreatestCommonDivisorOfStrings2();

    @Test
    void Example1() {
        String str1 = "ABCABC", str2 = "ABC";

        Assertions.assertEquals("ABC", greatestCommonDivisorOfStrings.gcdOfStrings(str1, str2));
        Assertions.assertEquals("ABC", greatestCommonDivisorOfStrings2.gcdOfStrings(str1, str2));
    }

    @Test
    void Example2() {
        String str1 = "ABABAB", str2 = "ABAB";

        Assertions.assertEquals("AB", greatestCommonDivisorOfStrings.gcdOfStrings(str1, str2));
        Assertions.assertEquals("AB", greatestCommonDivisorOfStrings2.gcdOfStrings(str1, str2));
    }

    @Test
    void Example3() {
        String str1 = "LEET", str2 = "CODE";

        Assertions.assertEquals("", greatestCommonDivisorOfStrings.gcdOfStrings(str1, str2));
        Assertions.assertEquals("", greatestCommonDivisorOfStrings2.gcdOfStrings(str1, str2));
    }
}
