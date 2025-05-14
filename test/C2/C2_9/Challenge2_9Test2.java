package test.C2.C2_9;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import raw.Chapter2.Challenge2_9;
import static raw.Chapter2.Challenge2_9.Solution.removeElements;


import static org.junit.jupiter.api.Assertions.assertEquals;

class Challenge2_9Test2 {
    static Challenge2_9.Solution.ListNode head;
    @BeforeAll
    static void prepare_linklist() {
        head = new Challenge2_9.Solution.ListNode(7);
        Challenge2_9.Solution.ListNode p2 = new Challenge2_9.Solution.ListNode(7);
        Challenge2_9.Solution.ListNode p3 = new Challenge2_9.Solution.ListNode(7);
        Challenge2_9.Solution.ListNode p4 = new Challenge2_9.Solution.ListNode(7);
        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = null;
    }

    @Test
    void simple_test1(){
        assertEquals(null,removeElements(head,7));
    }

}