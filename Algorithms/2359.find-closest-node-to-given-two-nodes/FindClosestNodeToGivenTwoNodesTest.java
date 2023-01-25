import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindClosestNodeToGivenTwoNodesTest {
    FindClosestNodeToGivenTwoNodes findClosestNodeToGivenTwoNodes = new FindClosestNodeToGivenTwoNodes();
    FindClosestNodeToGivenTwoNodes2 findClosestNodeToGivenTwoNodes2 = new FindClosestNodeToGivenTwoNodes2();

    @Test
    void Example1() {
        int[] edges = {2, 2, 3, -1};
        int node1 = 0, node2 = 1;

        Assertions.assertEquals(2, findClosestNodeToGivenTwoNodes.closestMeetingNode(edges, node1, node2));
        Assertions.assertEquals(2, findClosestNodeToGivenTwoNodes2.closestMeetingNode(edges, node1, node2));
    }

    @Test
    void Example2() {
        int[] edges = {1, 2, -1};
        int node1 = 0, node2 = 2;

        Assertions.assertEquals(2, findClosestNodeToGivenTwoNodes.closestMeetingNode(edges, node1, node2));
        Assertions.assertEquals(2, findClosestNodeToGivenTwoNodes2.closestMeetingNode(edges, node1, node2));
    }
}
