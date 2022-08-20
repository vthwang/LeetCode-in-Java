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

        NextNode results = PopulatingNextRightPointersInEachNode.connect(root);

        Assertions.assertNull(results.next);
        Assertions.assertEquals(3, results.left.next.val);
        Assertions.assertNull(results.right.next);
        Assertions.assertEquals(5, results.left.left.next.val);
        Assertions.assertEquals(6, results.left.right.next.val);
        Assertions.assertEquals(7, results.right.left.next.val);
        Assertions.assertNull(results.right.right.next);
    }

    @Test
    void Example2() {
        NextNode results = PopulatingNextRightPointersInEachNode.connect(null);
        Assertions.assertNull(results);
    }
}
