import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagramsTest {
    GroupAnagrams GroupAnagrams = new GroupAnagrams();

    @Test
    void Example1() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> results = GroupAnagrams.groupAnagrams(strs);
        List<List<String>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList("eat", "tea", "ate"));
        expectedResults.add(List.of("bat"));
        expectedResults.add(Arrays.asList("tan", "nat"));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String[] strs = {""};
        List<List<String>> results = GroupAnagrams.groupAnagrams(strs);
        List<List<String>> expectedResults = new ArrayList<>();
        expectedResults.add(List.of(""));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example3() {
        String[] strs = {"a"};
        List<List<String>> results = GroupAnagrams.groupAnagrams(strs);
        List<List<String>> expectedResults = new ArrayList<>();
        expectedResults.add(List.of("a"));

        Assertions.assertEquals(expectedResults, results);
    }
}
