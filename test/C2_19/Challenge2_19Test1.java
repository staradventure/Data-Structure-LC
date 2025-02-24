package test.C2_19;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import raw.Challenge2_19;
import raw.Challenge2_19.Solution.ListNode;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Challenge2_19.Solution.insertionSortList;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_19Test1 {

    static Challenge2_19.Solution.ListNode head;

    @BeforeAll
    static void createList() {
        head = new ListNode(4);
        ListNode p2 = new ListNode(2);
        ListNode p3 = new ListNode(1);
        ListNode p4 = new ListNode(3);
        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = null;
    }

    @Test
    void simple_test1() {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode t = head;
        while (t != null) {
            list.add(t.val);
            t=t.next;
        }
        Integer[] expected = {1,2,3,4};
        ArrayList<Integer> list2 = new ArrayList<>();
        ListNode result = insertionSortList(head);
        ListNode m = result;
        while (m != null) {
            list2.add(m.val);
            m=m.next;
        }
        Integer[] actual = list2.toArray(new Integer[0]);
        assertArrayEquals(expected, actual);

    }
}