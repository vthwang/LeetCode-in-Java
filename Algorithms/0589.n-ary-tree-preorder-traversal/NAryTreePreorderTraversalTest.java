import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class NAryTreePreorderTraversalTest {
    NAryTreePreorderTraversal NAryTreePreorderTraversal = new NAryTreePreorderTraversal();

    @Test
    void Example1() {
        Node root = new Node(1);
        Node secondFirst = new Node(3);
        Node secondSecond = new Node(2);
        Node secondThird = new Node(4);
        root.children = Arrays.asList(secondFirst, secondSecond, secondThird);
        Node thirdFirst = new Node(5);
        Node thirdSecond = new Node(6);
        secondFirst.children = Arrays.asList(thirdFirst, thirdSecond);

        List<Integer> results = NAryTreePreorderTraversal.preorder(root);
        List<Integer> expectedResults = Arrays.asList(1, 3, 5, 6, 2, 4);

        Assertions.assertEquals(expectedResults, results);
    }

    @Test
    void Example2() {
        Node root = new Node(1);
        Node secondFirst = new Node(2);
        Node secondSecond = new Node(3);
        Node secondThird = new Node(4);
        Node secondForth = new Node(5);
        root.children = Arrays.asList(secondFirst, secondSecond, secondThird, secondForth);
        Node thirdFirst = new Node(6);
        Node thirdSecond = new Node(7);
        Node thirdThird = new Node(8);
        Node thirdForth = new Node(9);
        Node thirdFifth = new Node(10);
        secondSecond.children = Arrays.asList(thirdFirst, thirdSecond);
        secondThird.children = List.of(thirdThird);
        secondForth.children = Arrays.asList(thirdForth, thirdFifth);
        Node forthFirst = new Node(11);
        Node forthSecond = new Node(12);
        Node forthThird = new Node(13);
        thirdSecond.children = List.of(forthFirst);
        thirdThird.children = List.of(forthSecond);
        thirdForth.children = List.of(forthThird);
        Node fifthFirst = new Node(14);
        forthFirst.children = List.of(fifthFirst);

        List<Integer> results = NAryTreePreorderTraversal.preorder(root);
        List<Integer> expectedResults = Arrays.asList(1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10);

        Assertions.assertEquals(expectedResults, results);
    }
}
