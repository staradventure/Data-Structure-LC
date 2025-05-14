package test.C2.C2_14;

import org.junit.jupiter.api.*;
import raw.Chapter2.Challenge2_14;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_14Test1 {

    static Challenge2_14.Solution.ListNode head;
    static Challenge2_14.Solution.ListNode result;
    final int x=3;

    @BeforeAll
    static void createLinklist(){
        head=new Challenge2_14.Solution.ListNode(1);
        Challenge2_14.Solution.ListNode p2=new Challenge2_14.Solution.ListNode(4);
        Challenge2_14.Solution.ListNode p3=new Challenge2_14.Solution.ListNode(3);
        Challenge2_14.Solution.ListNode p4=new Challenge2_14.Solution.ListNode(2);
        Challenge2_14.Solution.ListNode p5=new Challenge2_14.Solution.ListNode(5);
        Challenge2_14.Solution.ListNode p6=new Challenge2_14.Solution.ListNode(2);
        head.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=p6;
        p6.next=null;
    }

    @Test
    @Order(1)
    void runningFine(){
        assertDoesNotThrow(()->{
            try{
                Challenge2_14.Solution s=new Challenge2_14.Solution();
                result=s.partition(head,x);
            }catch (Exception e){
                throw e;
            }
        });
    }

    @Test
    @Order(2)
    void resultCorrect(){
        ArrayList<Integer> list=new ArrayList<>();
        Challenge2_14.Solution.ListNode p=result;
        while(p!=null){
            list.add(p.val);
            p=p.next;
        }
        Integer [] expected={1,2,2,4,3,5};
        Integer [] actual=list.toArray(new Integer[0]);
        assertArrayEquals(expected,actual);
    }

}