package test.C2_24;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import raw.Chapter2.Challenge2_24;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_24.Solution.mergeTwoLists;

class Challenge2_24Test3 {

    static Challenge2_24.Solution.ListNode list1;
    static Challenge2_24.Solution.ListNode list2;

    @BeforeAll
    static void createList(){
        list1 =null;
        list2=new Challenge2_24.Solution.ListNode(0);
    }

    @Test
    void shortTime_test1(){
        assertTimeoutPreemptively(Duration.ofMillis(40),()->{
            Challenge2_24.Solution.ListNode testing=mergeTwoLists(list1,list2);
        });
    }

    @Test
    void Ok_test1(){
        assertDoesNotThrow(()->{
            Challenge2_24.Solution.ListNode testing=mergeTwoLists(list1,list2);
        });
    }

    @Test
    void whetherCorrect_test1(){
        Challenge2_24.Solution.ListNode testing=mergeTwoLists(list1,list2);
        Challenge2_24.Solution.ListNode t=testing;
        ArrayList<Integer> list=new ArrayList<>();
        while(t!=null){
            list.add(t.val);
            t=t.next;
        }
        Integer [] expected={0};
        Integer [] actual=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected,actual);
    }

}