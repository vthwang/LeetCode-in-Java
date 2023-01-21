import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddressesTest {
    RestoreIpAddresses restoreIpAddresses = new RestoreIpAddresses();

    @Test
    void Example1() {
        String s = "25525511135";

        List<String> expectedResults = new ArrayList<>();
        expectedResults.add("255.255.11.135");
        expectedResults.add("255.255.111.35");
        Assertions.assertEquals(expectedResults, restoreIpAddresses.restoreIpAddresses(s));
    }

    @Test
    void Example2() {
        String s = "0000";

        List<String> expectedResults = new ArrayList<>();
        expectedResults.add("0.0.0.0");
        Assertions.assertEquals(expectedResults, restoreIpAddresses.restoreIpAddresses(s));
    }

    @Test
    void Example3() {
        String s = "101023";

        List<String> expectedResults = new ArrayList<>();
        expectedResults.add("1.0.10.23");
        expectedResults.add("1.0.102.3");
        expectedResults.add("10.1.0.23");
        expectedResults.add("10.10.2.3");
        expectedResults.add("101.0.2.3");
        Assertions.assertEquals(expectedResults, restoreIpAddresses.restoreIpAddresses(s));
    }
}
