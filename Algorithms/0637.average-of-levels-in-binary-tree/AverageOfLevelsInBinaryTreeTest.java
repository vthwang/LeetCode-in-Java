import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevelsInBinaryTreeTest {
    AverageOfLevelsInBinaryTree AverageOfLevelsInBinaryTree = new AverageOfLevelsInBinaryTree();

    @Test
    void Example1() {
        TreeNode firstNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(9);
        TreeNode thirdNode = new TreeNode(20);
        TreeNode forthNode = new TreeNode(15);
        TreeNode fifthNode = new TreeNode(7);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        thirdNode.left = forthNode;
        thirdNode.right = fifthNode;

        List<Double> results = AverageOfLevelsInBinaryTree.averageOfLevels(firstNode);
        List<Double> expectedResult = new ArrayList<>();
        expectedResult.add(3.0);
        expectedResult.add(14.5);
        expectedResult.add(11.0);

        Assertions.assertEquals(expectedResult, results);
    }

    @Test
    void Example2() {
        TreeNode firstNode = new TreeNode(3);
        TreeNode secondNode = new TreeNode(9);
        TreeNode thirdNode = new TreeNode(20);
        TreeNode forthNode = new TreeNode(15);
        TreeNode fifthNode = new TreeNode(7);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;

        List<Double> results = AverageOfLevelsInBinaryTree.averageOfLevels(firstNode);
        List<Double> expectedResult = new ArrayList<>();
        expectedResult.add(3.0);
        expectedResult.add(14.5);
        expectedResult.add(11.0);

        Assertions.assertEquals(expectedResult, results);
    }
}
