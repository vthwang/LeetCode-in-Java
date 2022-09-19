import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateFileInSystemTest {
    FindDuplicateFileInSystem FindDuplicateFileInSystem = new FindDuplicateFileInSystem();

    @Test
    void Example1() {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        List<List<String>> results = FindDuplicateFileInSystem.findDuplicate(paths);
        List<List<String>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList("root/a/2.txt", "root/c/d/4.txt", "root/4.txt"));
        expectedResults.add(Arrays.asList("root/a/1.txt", "root/c/3.txt"));

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)"};
        List<List<String>> results = FindDuplicateFileInSystem.findDuplicate(paths);
        List<List<String>> expectedResults = new ArrayList<>();
        expectedResults.add(Arrays.asList("root/a/2.txt", "root/c/d/4.txt"));
        expectedResults.add(Arrays.asList("root/a/1.txt", "root/c/3.txt"));

        Assertions.assertEquals(expectedResults, results);
    }
}
