package test.C2_11;

import org.junit.jupiter.api.*;
import raw.Chapter2.Challenge2_11;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_11.Solution.reverseList;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_11Test {

    static Challenge2_11.Solution.ListNode head;

    @BeforeAll
    static void createList() {
        head = new Challenge2_11.Solution.ListNode(1);
        Challenge2_11.Solution.ListNode p2 = new Challenge2_11.Solution.ListNode(2);
        Challenge2_11.Solution.ListNode p3 = new Challenge2_11.Solution.ListNode(3);
        Challenge2_11.Solution.ListNode p4 = new Challenge2_11.Solution.ListNode(4);
        Challenge2_11.Solution.ListNode p5 = new Challenge2_11.Solution.ListNode(5);
        head.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;
        p5.next = null;
    }

    @Test
    @Order(1)
    void simple_test1(){
        assertDoesNotThrow(()->{head=reverseList(head);});
    }

    @Test
    @Order(3)
    void simple_test2(){
        int count=5;
        //检查链表是否连接正确
        Challenge2_11.Solution.ListNode t=head;
        for(int i=1;i<=count-1;i++){
            if(t.next==null){
                assertDoesNotThrow(() -> { throw new NullPointerException(); });
            }
            t=t.next;
        }
    }

    @Test
    @Order(3)
    void simple_test3(){
        ArrayList<Integer> list=new ArrayList<>();
        Challenge2_11.Solution.ListNode s=head;
        while(s!=null){
            list.add(s.val);
            s=s.next;
        }
        Integer[] expected={5,4,3,2,1};
        Integer[] actual= list.toArray(new Integer[0]);
        assertArrayEquals(expected,actual);
    }
}