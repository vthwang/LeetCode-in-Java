import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordSearchTest {
    WordSearch wordSearch = new WordSearch();

    @Test
    void Example1() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean results = wordSearch.exist(board, word);

        Assertions.assertTrue(results);
    }

    @Test
    void Example2() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "SEE";
        boolean results = wordSearch.exist(board, word);

        Assertions.assertTrue(results);
    }

    @Test
    void Example3() {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCB";
        boolean results = wordSearch.exist(board, word);

        Assertions.assertFalse(results);
    }
}
