import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BackspaceStringCompareTest {
    BackspaceStringCompare BackspaceStringCompare = new BackspaceStringCompare();

    @Test
    void Example1() {
        String s = "ab#c", t = "ad#c";
        boolean results = BackspaceStringCompare.backspaceCompare(s, t);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "ab##", t = "c#d#";
        boolean results = BackspaceStringCompare.backspaceCompare(s, t);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String s = "a#c", t = "b";
        boolean results = BackspaceStringCompare.backspaceCompare(s, t);
        boolean expectedResults = false;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example4() {
        String s = "a##c", t = "#a#c";
        boolean results = BackspaceStringCompare.backspaceCompare(s, t);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example5() {
        String s = "bxj##tw", t = "bxo#j##tw";
        boolean results = BackspaceStringCompare.backspaceCompare(s, t);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example6() {
        String s = "xywrrmp", t = "xywrrmu#p";
        boolean results = BackspaceStringCompare.backspaceCompare(s, t);
        boolean expectedResults = true;

        Assertions.assertEquals(expectedResults, results);
    }
}
