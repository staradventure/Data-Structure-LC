package test.C2_12;

import org.junit.jupiter.api.*;
import raw.Chapter2.Challenge2_12;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static raw.Chapter2.Challenge2_12.Solution.reverseBetween;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_12Test2 {

    static Challenge2_12.Solution.ListNode head;
    final int left = 1;
    final int right = 1;
    static Challenge2_12.Solution.ListNode result;

    @BeforeAll
    static void createLinklist() {
        head = new Challenge2_12.Solution.ListNode(5);
        head.next=null;
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
        Integer[] expected = {5};
        Integer[] actual = list.toArray(new Integer[0]);
        assertArrayEquals(expected, actual);
    }

}