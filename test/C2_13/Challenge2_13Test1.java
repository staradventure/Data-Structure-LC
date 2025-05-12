package test.C2_13;

import org.junit.jupiter.api.*;

import raw.Chapter2.Challenge2_13;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_13.Solution.oddEvenList;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_13Test1 {

    static Challenge2_13.Solution.ListNode head;
    static Challenge2_13.Solution.ListNode result;

    @BeforeAll
    static void createLinklist() {
        head = new Challenge2_13.Solution.ListNode(1);
        Challenge2_13.Solution.ListNode p2 = new Challenge2_13.Solution.ListNode(2);
        Challenge2_13.Solution.ListNode p3 = new Challenge2_13.Solution.ListNode(3);
        Challenge2_13.Solution.ListNode p4 = new Challenge2_13.Solution.ListNode(4);
        Challenge2_13.Solution.ListNode p5 = new Challenge2_13.Solution.ListNode(5);
        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = null;
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
        Integer[] expected={1,3,5,2,4};
        Integer[] actual=list.toArray(new Integer[0]);
        assertArrayEquals(expected,actual);
    }


}