package test.C2_20;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import raw.Chapter2.Challenge2_20;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_20.Solution.reverseGroup;

class Challenge2_20Test1 {

    static Challenge2_20.Solution.ListNode head;

    @BeforeAll
    public static void createList(){
        head=new Challenge2_20.Solution.ListNode(1);
        Challenge2_20.Solution.ListNode p2=new Challenge2_20.Solution.ListNode(2);
        Challenge2_20.Solution.ListNode p3=new Challenge2_20.Solution.ListNode(3);
        Challenge2_20.Solution.ListNode p4=new Challenge2_20.Solution.ListNode(4);
        Challenge2_20.Solution.ListNode p5=new Challenge2_20.Solution.ListNode(5);
        head.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=null;
    }

    @Test
    public void simpleTest1(){
        Challenge2_20.Solution.ListNode result=reverseGroup(head,2);
        ArrayList<Integer> list=new ArrayList<>();
        Challenge2_20.Solution.ListNode p=result;
        while(p!=null){
            list.add(p.val);
            p=p.next;
        }
        Integer [] expected={2,1,4,3,5};
        Integer [] actual=list.toArray(new Integer[0]);
        assertArrayEquals(expected,actual);
    }
}