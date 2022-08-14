import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordLadderIiTest {
    WordLadderIi WordLadderIi = new WordLadderIi();

    @Test
    void Example1() {
        String beginWord = "hit", endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        List<List<String>> results = WordLadderIi.findLadders(beginWord, endWord, wordList);
        List<List<String>> expectedResults = new ArrayList<>();
        List<String> firstList = Arrays.asList("hit","hot","dot","dog","cog");
        List<String> secondList = Arrays.asList("hit","hot","lot","log","cog");
        expectedResults.add(firstList);
        expectedResults.add(secondList);

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String beginWord = "hit", endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log");
        List<List<String>> results = WordLadderIi.findLadders(beginWord, endWord, wordList);
        List<List<String>> expectedResults = new ArrayList<>();

        Assertions.assertEquals(expectedResults, results);
    }
}
