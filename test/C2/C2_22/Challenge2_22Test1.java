package test.C2.C2_22;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_22.Solution.deleteDuplicates;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import raw.Chapter2.Challenge2_22;

import java.util.ArrayList;

class Challenge2_22Test1 {

    static Challenge2_22.Solution.ListNode head;

    @BeforeAll
    static void createList(){
        head=new Challenge2_22.Solution.ListNode(1);
        Challenge2_22.Solution.ListNode p2=new Challenge2_22.Solution.ListNode(1);
        Challenge2_22.Solution.ListNode p3=new Challenge2_22.Solution.ListNode(2);
        Challenge2_22.Solution.ListNode p4=new Challenge2_22.Solution.ListNode(3);
        Challenge2_22.Solution.ListNode p5=new Challenge2_22.Solution.ListNode(3);
        head.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=null;
    }

    @Test
    void OK_test1(){
        assertDoesNotThrow(()->{
            Challenge2_22.Solution.ListNode testing=deleteDuplicates(head);
        });
    }

    @Test
    void correct_test1(){
        Challenge2_22.Solution.ListNode result=deleteDuplicates(head);
        Challenge2_22.Solution.ListNode p1=result;
        ArrayList <Integer> list=new ArrayList<>();
        while(p1!=null){
            list.add(p1.val);
            p1=p1.next;
        }
        Integer [] expected= {1,2,3};
        Integer [] actual=list.toArray(new Integer[0]);
        assertArrayEquals(expected,actual);
    }

}