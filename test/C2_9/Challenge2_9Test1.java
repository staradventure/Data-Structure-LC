package test.C2_9;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_9.Solution.removeElements;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import raw.Chapter2.Challenge2_9;

class Challenge2_9Test1 {
    static Challenge2_9.Solution.ListNode head;
    @BeforeAll
    static void prepare_linklist(){
        head=null;
    }

    @Test
    void simple_test1(){
        assertEquals(null,removeElements(head,1));
    }

}