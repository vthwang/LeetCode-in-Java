import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NAryTreeLevelOrderTraversalTest {
    NAryTreeLevelOrderTraversal NAryTreeLevelOrderTraversal = new NAryTreeLevelOrderTraversal();
    NAryTreeLevelOrderTraversal2 NAryTreeLevelOrderTraversal2 = new NAryTreeLevelOrderTraversal2();

    @Test
    void Example1() {
        Node root = new Node(1);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(2);
        Node forthNode = new Node(4);
        Node fifthNode = new Node(5);
        Node sixthNode = new Node(6);
        root.children = Arrays.asList(secondNode, thirdNode, forthNode);
        secondNode.children = Arrays.asList(fifthNode, sixthNode);
        List<List<Integer>> results = NAryTreeLevelOrderTraversal.levelOrder(root);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(List.of(1));
        expectedResults.add(Arrays.asList(3, 2, 4));
        expectedResults.add(Arrays.asList(5, 6));

        Assertions.assertEquals(expectedResults, results);

        results = NAryTreeLevelOrderTraversal2.levelOrder(root);
        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        Node root = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node forthNode = new Node(4);
        Node fifthNode = new Node(5);
        Node sixthNode = new Node(6);
        Node seventhNode = new Node(7);
        Node eighthNode = new Node(8);
        Node ninthNode = new Node(9);
        Node tenthNode = new Node(10);
        Node eleventhNode = new Node(11);
        Node twelfthNode = new Node(12);
        Node thirteenthNode = new Node(13);
        Node fourteenthNode = new Node(14);
        root.children = Arrays.asList(secondNode, thirdNode, forthNode, fifthNode);
        thirdNode.children = Arrays.asList(sixthNode, seventhNode);
        forthNode.children = List.of(eighthNode);
        fifthNode.children = Arrays.asList(ninthNode, tenthNode);
        seventhNode.children = List.of(eleventhNode);
        eighthNode.children = List.of(twelfthNode);
        ninthNode.children = List.of(thirteenthNode);
        eleventhNode.children = List.of(fourteenthNode);

        List<List<Integer>> results = NAryTreeLevelOrderTraversal.levelOrder(root);
        List<List<Integer>> expectedResults = new ArrayList<>();
        expectedResults.add(List.of(1));
        expectedResults.add(Arrays.asList(2, 3, 4, 5));
        expectedResults.add(Arrays.asList(6, 7, 8, 9, 10));
        expectedResults.add(Arrays.asList(11, 12, 13));
        expectedResults.add(List.of(14));

        Assertions.assertEquals(expectedResults, results);

        results = NAryTreeLevelOrderTraversal2.levelOrder(root);
        Assertions.assertEquals(expectedResults, results);
    }
}
