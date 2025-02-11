package test.C2_17;

import org.junit.jupiter.api.Test;
import raw.Challenge2_17;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Challenge2_17.Solution.isPalindrome;

class Challenge2_17Test {

    @Test
    void nodeNumberIsOne_True(){
        Challenge2_17.Solution.ListNode head=new Challenge2_17.Solution.ListNode(1);
        assertTrue(isPalindrome(head));
    }

    @Test
    void simple_test1(){
        Challenge2_17.Solution.ListNode head=new Challenge2_17.Solution.ListNode(1);
        Challenge2_17.Solution.ListNode p2=new Challenge2_17.Solution.ListNode(2);
        Challenge2_17.Solution.ListNode p3=new Challenge2_17.Solution.ListNode(2);
        Challenge2_17.Solution.ListNode p4=new Challenge2_17.Solution.ListNode(1);
        head.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=null;
        assertTrue(isPalindrome(head));
    }

    @Test
    void simple_test2(){
        Challenge2_17.Solution.ListNode head=new Challenge2_17.Solution.ListNode(1);
        Challenge2_17.Solution.ListNode p2=new Challenge2_17.Solution.ListNode(2);
        head.next=p2;
        p2.next=null;
        assertFalse(isPalindrome(head));
    }

    @Test
    void numberIsOdd_False(){
        Challenge2_17.Solution.ListNode head=new Challenge2_17.Solution.ListNode(1);
        Challenge2_17.Solution.ListNode p2=new Challenge2_17.Solution.ListNode(2);
        Challenge2_17.Solution.ListNode p3=new Challenge2_17.Solution.ListNode(3);
        head.next=p2;
        p2.next=p3;
        p3.next=null;
        assertFalse(isPalindrome(head));
    }

    @Test
    void numberIsOdd2_False(){
        Challenge2_17.Solution.ListNode head=new Challenge2_17.Solution.ListNode(1);
        Challenge2_17.Solution.ListNode p2=new Challenge2_17.Solution.ListNode(2);
        Challenge2_17.Solution.ListNode p3=new Challenge2_17.Solution.ListNode(2);
        head.next=p2;
        p2.next=p3;
        p3.next=null;
        assertFalse(isPalindrome(head));
    }

    @Test
    void numberIsOdd2_True(){
        Challenge2_17.Solution.ListNode head=new Challenge2_17.Solution.ListNode(1);
        Challenge2_17.Solution.ListNode p2=new Challenge2_17.Solution.ListNode(0);
        Challenge2_17.Solution.ListNode p3=new Challenge2_17.Solution.ListNode(1);
        head.next=p2;
        p2.next=p3;
        p3.next=null;
        assertTrue(isPalindrome(head));
    }
    @Test
    void numberIsOdd3_True(){
        Challenge2_17.Solution.ListNode head=new Challenge2_17.Solution.ListNode(1);
        Challenge2_17.Solution.ListNode p2=new Challenge2_17.Solution.ListNode(0);
        Challenge2_17.Solution.ListNode p3=new Challenge2_17.Solution.ListNode(1);
        Challenge2_17.Solution.ListNode p4=new Challenge2_17.Solution.ListNode(0);
        Challenge2_17.Solution.ListNode p5=new Challenge2_17.Solution.ListNode(1);
        head.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=null;
        assertTrue(isPalindrome(head));
    }



}