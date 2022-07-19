import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleTest {
    PascalsTriangle PascalsTriangle = new PascalsTriangle();

    @Test
    void Example1() {
        int numRows = 5;
        List<List<Integer>> results = PascalsTriangle.generate(numRows);
        List<List<Integer>> expectedResults = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        List<Integer> third = new ArrayList<>();
        List<Integer> forth = new ArrayList<>();
        List<Integer> fifth = new ArrayList<>();
        first.add(1);
        second.add(1);
        second.add(1);
        third.add(1);
        third.add(2);
        third.add(1);
        forth.add(1);
        forth.add(3);
        forth.add(3);
        forth.add(1);
        fifth.add(1);
        fifth.add(4);
        fifth.add(6);
        fifth.add(4);
        fifth.add(1);
        expectedResults.add(first);
        expectedResults.add(second);
        expectedResults.add(third);
        expectedResults.add(forth);
        expectedResults.add(fifth);

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        int numRows = 1;
        List<List<Integer>> results = PascalsTriangle.generate(numRows);
        List<List<Integer>> expectedResults = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        expectedResults.add(first);

        Assertions.assertEquals(expectedResults, results);
    }
}
