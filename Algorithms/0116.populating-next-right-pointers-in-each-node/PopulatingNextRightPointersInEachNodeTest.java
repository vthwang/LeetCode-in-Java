import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PopulatingNextRightPointersInEachNodeTest {
    PopulatingNextRightPointersInEachNode PopulatingNextRightPointersInEachNode = new PopulatingNextRightPointersInEachNode();

    @Test
    void Example1() {
        NextNode root = new NextNode(1);
        root.left = new NextNode(2);
        root.right = new NextNode(3);
        root.left.left = new NextNode(4);
        root.left.right = new NextNode(5);
        root.right.left = new NextNode(6);
        root.right.right = new NextNode(7);

        NextNode expectedResults = PopulatingNextRightPointersInEachNode.connect(root);

        Assertions.assertNull(expectedResults.next);
        Assertions.assertEquals(3, expectedResults.left.next.val);
        Assertions.assertNull(expectedResults.right.next);
        Assertions.assertEquals(5, expectedResults.left.left.next.val);
        Assertions.assertEquals(6, expectedResults.left.right.next.val);
        Assertions.assertEquals(7, expectedResults.right.left.next.val);
        Assertions.assertNull(expectedResults.right.right.next);
    }

    @Test
    void Example2() {
        NextNode expectedResults = PopulatingNextRightPointersInEachNode.connect(null);
        Assertions.assertNull(expectedResults);
    }
}
