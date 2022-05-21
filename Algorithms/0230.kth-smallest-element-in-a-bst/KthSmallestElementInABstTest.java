import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthSmallestElementInABstTest {
    KthSmallestElementInABst KthSmallestElementInABst = new KthSmallestElementInABst();
    KthSmallestElementInABst2 KthSmallestElementInABst2 = new KthSmallestElementInABst2();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(1);
        TreeNode thirdNode = new TreeNode(4);
        TreeNode forthNode = new TreeNode(2);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.right = forthNode;

        int k = 1;
        int results = KthSmallestElementInABst.kthSmallest(firstNode, k);
        int expectedResult = 1;

        Assertions.assertEquals(expectedResult, results);

        results = KthSmallestElementInABst2.kthSmallest(firstNode, k);
        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(5);
        TreeNode secondNode = new TreeNode(3);
        TreeNode thirdNode = new TreeNode(6);
        TreeNode forthNode = new TreeNode(2);
        TreeNode fifthNode = new TreeNode(4);
        TreeNode sixthNode = new TreeNode(1);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;
        forthNode.left = sixthNode;

        int k = 3;
        int results = KthSmallestElementInABst.kthSmallest(firstNode, k);
        int expectedResult = 3;

        Assertions.assertEquals(expectedResult, results);

        results = KthSmallestElementInABst2.kthSmallest(firstNode, k);
        Assertions.assertEquals(expectedResult, results);
    }
}
