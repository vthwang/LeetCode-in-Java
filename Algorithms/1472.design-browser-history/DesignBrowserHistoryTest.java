import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DesignBrowserHistoryTest {
    @Test
    void Example1() {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        Assertions.assertEquals("facebook.com", browserHistory.back(1));
        Assertions.assertEquals("google.com", browserHistory.back(1));
        Assertions.assertEquals("facebook.com", browserHistory.forward(1));
        browserHistory.visit("linkedin.com");
        Assertions.assertEquals("linkedin.com", browserHistory.forward(2));
        Assertions.assertEquals("google.com", browserHistory.back(2));
        Assertions.assertEquals("leetcode.com", browserHistory.back(7));
        browserHistory.back(7);
    }
}
