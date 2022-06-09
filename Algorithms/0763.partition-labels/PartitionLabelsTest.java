import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabelsTest {
    PartitionLabels PartitionLabels = new PartitionLabels();

    @Test
    void Example1() {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> results = PartitionLabels.partitionLabels(s);
        List<Integer> expectedResults = new ArrayList<>();;
        expectedResults.add(9);
        expectedResults.add(7);
        expectedResults.add(8);

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        String s = "eccbbbbdec";
        List<Integer> results = PartitionLabels.partitionLabels(s);
        List<Integer> expectedResults = new ArrayList<>();;
        expectedResults.add(10);

        Assertions.assertEquals(expectedResults, results);
    }
}
