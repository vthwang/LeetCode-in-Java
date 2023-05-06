import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {
    MaximumNumberOfVowelsInASubstringOfGivenLength maximumNumberOfVowelsInASubstringOfGivenLength = new MaximumNumberOfVowelsInASubstringOfGivenLength();

    @Test
    void Example1() {
        String s = "abciiidef";
        int k = 3;

        Assertions.assertEquals(3, maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k));
    }

    @Test
    void Example2() {
        String s = "aeiou";
        int k = 2;

        Assertions.assertEquals(2, maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k));
    }

    @Test
    void Example3() {
        String s = "leetcode";
        int k = 3;

        Assertions.assertEquals(2, maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k));
    }

    @Test
    void Example4() {
        String s = "weallloveyou";
        int k = 7;

        Assertions.assertEquals(4, maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k));
    }

    @Test
    void Example5() {
        String s = "ibpbhixfiouhdljnjfflpapptrxgcomvnb";
        int k = 33;

        Assertions.assertEquals(7, maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k));
    }
}
