package test.C2_21;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import raw.Challenge2_21;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static raw.Challenge2_21.Solution.splitListToParts;

class Challenge2_21Test2 {

    static Challenge2_21.Solution.ListNode head;
    static Challenge2_21.Solution.ListNode [] result;

    @BeforeAll
    static void CreateList(){
        head=new Challenge2_21.Solution.ListNode(1);
        Challenge2_21.Solution.ListNode p2=new Challenge2_21.Solution.ListNode(2);
        Challenge2_21.Solution.ListNode p3=new Challenge2_21.Solution.ListNode(3);
        head.next=p2;
        p2.next=p3;
        p3.next=null;
    }

    @Test
    void time_test1(){
        assertTimeoutPreemptively(Duration.ofMillis(40),()->{
            Challenge2_21.Solution.ListNode [] testing =splitListToParts(head,5);
        });
    }

    @Test
    void whetherOK_test1(){
        assertDoesNotThrow(()->{Challenge2_21.Solution.ListNode [] testing=splitListToParts(head,5);});

    }

}