import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImplementTriePrefixTreeTest {
    @Test
    void Example1() {
        Trie trie = new Trie();
        trie.insert("apple");
        Assertions.assertTrue(trie.search("apple"));
        Assertions.assertFalse(trie.search("app"));
        Assertions.assertTrue(trie.startsWith("app"));
        trie.insert("app");
        Assertions.assertTrue(trie.search("app"));
    }
}
