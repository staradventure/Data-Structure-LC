package test.C2.C2_10;

import org.junit.jupiter.api.*;
import raw.Chapter2.Challenge2_10;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_10.Solution.deleteNode;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_10Test {

    static Challenge2_10.Solution.ListNode head;
    static Challenge2_10.Solution.ListNode p2;
    static Challenge2_10.Solution.ListNode p3;
    static Challenge2_10.Solution.ListNode p4;

    @BeforeAll
    static void constructLinklist() {
        head = new Challenge2_10.Solution.ListNode(4);
        p2 = new Challenge2_10.Solution.ListNode(5);
        p3 = new Challenge2_10.Solution.ListNode(1);
        p4 = new Challenge2_10.Solution.ListNode(9);
        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = null;
    }

    @Test
    @Order(1)
    void simple_test1() {
        assertDoesNotThrow(()->deleteNode(p3));
    }

    @Test
    @Order(2)
    void simple_test2(){
        ArrayList <Integer> list=new ArrayList<>();
        Challenge2_10.Solution.ListNode s=head;
        while(s!=null){
            list.add(s.val);
            s=s.next;
        }
        Integer[] expected={4,5,9};
        Integer[] actual= list.toArray(new Integer[0]);
        assertArrayEquals(expected,actual);
    }

}