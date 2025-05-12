package test.C2_23;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import raw.Chapter2.Challenge2_23;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_23.Solution.deleteDuplicates;

class Challenge2_23Test2 {

    static Challenge2_23.Solution.ListNode head;

    @BeforeAll
    static void CreateList(){
        head=new Challenge2_23.Solution.ListNode(1);
        Challenge2_23.Solution.ListNode p2=new Challenge2_23.Solution.ListNode(1);
        Challenge2_23.Solution.ListNode p3=new Challenge2_23.Solution.ListNode(1);
        Challenge2_23.Solution.ListNode p4=new Challenge2_23.Solution.ListNode(2);
        Challenge2_23.Solution.ListNode p5=new Challenge2_23.Solution.ListNode(3);
        head.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=null;
    }

    @Test
    void short_test1(){
        assertTimeoutPreemptively(Duration.ofMillis(40),()->{
            Challenge2_23.Solution.ListNode testing=deleteDuplicates(head);
        });
    }


    @Test
    void OK_test1(){
        assertDoesNotThrow(()->{
            Challenge2_23.Solution.ListNode testing=deleteDuplicates(head);
        });
    }

    @Test
    void whether_correct_test1(){
        Challenge2_23.Solution.ListNode testing=deleteDuplicates(head);
        Challenge2_23.Solution.ListNode t=testing;
        ArrayList< Integer> list=new ArrayList<>();
        while(t!=null){
            list.add(t.val);
            t=t.next;
        }
        Integer [] expected={2,3};
        Integer [] actual=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected,actual);
    }

}