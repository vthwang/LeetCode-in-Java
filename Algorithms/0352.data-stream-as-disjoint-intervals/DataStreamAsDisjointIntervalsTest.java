import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataStreamAsDisjointIntervalsTest {
    @Test
    void Example1() {
        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.addNum(1);
        Assertions.assertArrayEquals(new int[][]{{1, 1}}, summaryRanges.getIntervals());
        summaryRanges.addNum(3);
        Assertions.assertArrayEquals(new int[][]{{1, 1}, {3, 3}}, summaryRanges.getIntervals());
        summaryRanges.addNum(7);
        Assertions.assertArrayEquals(new int[][]{{1, 1}, {3, 3}, {7, 7}}, summaryRanges.getIntervals());
        summaryRanges.addNum(2);
        Assertions.assertArrayEquals(new int[][]{{1, 3}, {7, 7}}, summaryRanges.getIntervals());
        summaryRanges.addNum(6);
        Assertions.assertArrayEquals(new int[][]{{1, 3}, {6, 7}}, summaryRanges.getIntervals());
    }
}
