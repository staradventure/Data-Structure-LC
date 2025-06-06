package test.C2.C2_12;

import org.junit.jupiter.api.*;
import raw.Chapter2.Challenge2_12;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_12.Solution.reverseBetween;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_12Test1 {

    static Challenge2_12.Solution.ListNode head;
    final int left = 2;
    final int right = 4;
    static Challenge2_12.Solution.ListNode result;

    @BeforeAll
    static void createLinklist() {
        head = new Challenge2_12.Solution.ListNode(1);
        Challenge2_12.Solution.ListNode p2 = new Challenge2_12.Solution.ListNode(2);
        Challenge2_12.Solution.ListNode p3 = new Challenge2_12.Solution.ListNode(3);
        Challenge2_12.Solution.ListNode p4 = new Challenge2_12.Solution.ListNode(4);
        Challenge2_12.Solution.ListNode p5 = new Challenge2_12.Solution.ListNode(5);
        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5 = null;
    }

    @Test
    @Order(1)
    void simple_test1() {
        assertDoesNotThrow(() -> {
            try {
                result = reverseBetween(head, left, right);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Test
    @Order(2)
    void simple_test2() {
        ArrayList<Integer> list = new ArrayList<>();
        Challenge2_12.Solution.ListNode p = result;
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        Integer[] expected = {1, 4, 3, 2, 5};
        Integer[] actual = list.toArray(new Integer[0]);
        assertArrayEquals(expected, actual);
    }

}