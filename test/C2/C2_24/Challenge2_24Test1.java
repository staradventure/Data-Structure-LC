package test.C2.C2_24;

import org.junit.jupiter.api.*;
import raw.Chapter2.Challenge2_24;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_24.Solution.mergeTwoLists;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_24Test1 {

    static Challenge2_24.Solution.ListNode list1;
    static Challenge2_24.Solution.ListNode list2;

    @BeforeAll
    static void createList(){
        list1 =new Challenge2_24.Solution.ListNode(1);
        Challenge2_24.Solution.ListNode list1_p2=new Challenge2_24.Solution.ListNode(2);
        Challenge2_24.Solution.ListNode list1_p3=new Challenge2_24.Solution.ListNode(4);
        list2 = new Challenge2_24.Solution.ListNode(1);
        Challenge2_24.Solution.ListNode list2_p2=new Challenge2_24.Solution.ListNode(3);
        Challenge2_24.Solution.ListNode list2_p3=new Challenge2_24.Solution.ListNode(4);
        list1.next=list1_p2;
        list1_p2.next=list1_p3;
        list1_p3.next=null;
        list2.next=list2_p2;
        list2_p2.next=list2_p3;
        list2_p3.next=null;
    }


    @Test
    @Order(1)
    void shortTime_test1(){
        assertTimeoutPreemptively(Duration.ofMillis(40),()->{
            Challenge2_24.Solution.ListNode testing=mergeTwoLists(list1,list2);
        });
    }


    @Test
    @Order(2)
    void Ok_test1(){
        assertDoesNotThrow(()->{
            Challenge2_24.Solution.ListNode testing=mergeTwoLists(list1,list2);
        });
    }


    @Test
    @Order(3)
    void whetherCorrect_test1(){
        Challenge2_24.Solution.ListNode testing=mergeTwoLists(list1,list2);
        Challenge2_24.Solution.ListNode t=testing;
        ArrayList<Integer> list=new ArrayList<>();
        while(t!=null){
            list.add(t.val);
            t=t.next;
        }
        Integer [] expected={1,1,2,3,4,4};
        Integer [] actual=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected,actual);
    }

}