package test.C2_21;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import raw.Chapter2.Challenge2_21;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_21.Solution.splitListToParts;

class Challenge2_21Test1 {

    static Challenge2_21.Solution.ListNode head;
    static Challenge2_21.Solution.ListNode [] result;

    @BeforeAll
    static void CreateList(){
        head=new Challenge2_21.Solution.ListNode(1);
        Challenge2_21.Solution.ListNode p2=new Challenge2_21.Solution.ListNode(2);
        Challenge2_21.Solution.ListNode p3=new Challenge2_21.Solution.ListNode(3);
        Challenge2_21.Solution.ListNode p4=new Challenge2_21.Solution.ListNode(4);
        Challenge2_21.Solution.ListNode p5=new Challenge2_21.Solution.ListNode(5);
        Challenge2_21.Solution.ListNode p6=new Challenge2_21.Solution.ListNode(6);
        Challenge2_21.Solution.ListNode p7=new Challenge2_21.Solution.ListNode(7);
        Challenge2_21.Solution.ListNode p8=new Challenge2_21.Solution.ListNode(8);
        Challenge2_21.Solution.ListNode p9=new Challenge2_21.Solution.ListNode(9);
        Challenge2_21.Solution.ListNode p10=new Challenge2_21.Solution.ListNode(10);
        head.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=p6;
        p6.next=p7;
        p7.next=p8;
        p8.next=p9;
        p9.next=p10;
        p10.next=null;
    }

    @Test
    void time_test1(){
        assertTimeoutPreemptively(Duration.ofMillis(40),()->{
            Challenge2_21.Solution.ListNode [] testing =splitListToParts(head,3);
        });
    }

    @Test
    void whetherCorrect_test1(){
        result=splitListToParts(head,3);
    }

}