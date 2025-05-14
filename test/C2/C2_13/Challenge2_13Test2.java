package test.C2.C2_13;

import org.junit.jupiter.api.*;
import raw.Chapter2.Challenge2_13;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static raw.Chapter2.Challenge2_13.Solution.oddEvenList;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_13Test2 {

    static Challenge2_13.Solution.ListNode head;
    static Challenge2_13.Solution.ListNode result;

    @BeforeAll
    static void createLinklist() {
        head = new Challenge2_13.Solution.ListNode(1);
        Challenge2_13.Solution.ListNode p2 = new Challenge2_13.Solution.ListNode(2);
        Challenge2_13.Solution.ListNode p3 = new Challenge2_13.Solution.ListNode(3);
        Challenge2_13.Solution.ListNode p4 = new Challenge2_13.Solution.ListNode(4);
        Challenge2_13.Solution.ListNode p5 = new Challenge2_13.Solution.ListNode(5);
        Challenge2_13.Solution.ListNode p6 = new Challenge2_13.Solution.ListNode(6);
        Challenge2_13.Solution.ListNode p7 = new Challenge2_13.Solution.ListNode(7);
        Challenge2_13.Solution.ListNode p8 = new Challenge2_13.Solution.ListNode(8);
        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = p6;
        p6.next=p7;
        p7.next=p8;
        p8.next=null;
    }

    /**
     * 检查函数使用是否正确。
     */
    @Test
    @Order(1)
    void simple_test1() {
        assertDoesNotThrow(()->{
        try {
            result = oddEvenList(head);
        } catch (Exception e) {
            throw e;
        }
        });
    }

    @Test
    @Order(2)
    void simple_test2(){
        ArrayList <Integer> list=new ArrayList<>();
        Challenge2_13.Solution.ListNode s=result;
        while(s!=null){
            list.add(s.val);
            s=s.next;
        }
        Integer[] expected={1,3,5,7,2,4,6,8};
        Integer[] actual=list.toArray(new Integer[0]);
        assertArrayEquals(expected,actual);
    }


}