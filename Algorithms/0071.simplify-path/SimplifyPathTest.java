import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimplifyPathTest {
    SimplifyPath simplifyPath = new SimplifyPath();

    @Test
    void Example1() {
        String path = "/home/";

        Assertions.assertEquals("/home", simplifyPath.simplifyPath(path));
    }

    @Test
    void Example2() {
        String path = "/../";

        Assertions.assertEquals("/", simplifyPath.simplifyPath(path));
    }

    @Test
    void Example3() {
        String path = "/home//foo/";

        Assertions.assertEquals("/home/foo", simplifyPath.simplifyPath(path));
    }

    @Test
    void Example4() {
        String path = "/a/./b/../../c/";

        Assertions.assertEquals("/c", simplifyPath.simplifyPath(path));
    }
}
