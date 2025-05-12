package test.C2_14;

import org.junit.jupiter.api.*;
import raw.Chapter2.Challenge2_14;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_14Test2 {

    static Challenge2_14.Solution.ListNode head;
    static Challenge2_14.Solution.ListNode result;
    final int x=0;

    @BeforeAll
    static void createLinklist(){
        head=new Challenge2_14.Solution.ListNode(1);
        head.next=null;
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
        Integer [] expected={1};
        Integer [] actual=list.toArray(new Integer[0]);
        assertArrayEquals(expected,actual);
    }

}