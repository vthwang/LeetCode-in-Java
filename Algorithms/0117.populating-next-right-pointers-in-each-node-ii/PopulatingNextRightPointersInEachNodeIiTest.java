import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PopulatingNextRightPointersInEachNodeIiTest {
    PopulatingNextRightPointersInEachNodeIi PopulatingNextRightPointersInEachNodeIi = new PopulatingNextRightPointersInEachNodeIi();

    @Test
    void Example1() {
        NextNode root = new NextNode(1);
        root.left = new NextNode(2);
        root.left.left = new NextNode(4);
        root.left.right = new NextNode(5);
        root.right = new NextNode(3);
        root.right.right = new NextNode(7);
        NextNode results = PopulatingNextRightPointersInEachNodeIi.connect(root);

        Assertions.assertEquals(3, results.left.next.val);
        Assertions.assertEquals(5, results.left.left.next.val);
        Assertions.assertEquals(7, results.left.right.next.val);
    }

    @Test
    void Example2() {
        NextNode results = PopulatingNextRightPointersInEachNodeIi.connect(null);

        Assertions.assertNull(results);
    }
}
