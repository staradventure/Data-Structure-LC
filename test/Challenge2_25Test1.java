package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import raw.Challenge2_25;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Challenge2_25.Solution.mergeKLists;

class Challenge2_25Test1 {

    static Challenge2_25.Solution.ListNode[] listNodes={};
    static Challenge2_25.Solution.ListNode result;

    @BeforeAll
    static void createList(){
        ArrayList<Challenge2_25.Solution.ListNode> list=new ArrayList<>();
        Challenge2_25.Solution.ListNode list1_p1=new Challenge2_25.Solution.ListNode(1);
        Challenge2_25.Solution.ListNode list1_p2=new Challenge2_25.Solution.ListNode(4);
        Challenge2_25.Solution.ListNode list1_p3=new Challenge2_25.Solution.ListNode(5);
        Challenge2_25.Solution.ListNode list2_p1=new Challenge2_25.Solution.ListNode(1);
        Challenge2_25.Solution.ListNode list2_p2=new Challenge2_25.Solution.ListNode(3);
        Challenge2_25.Solution.ListNode list2_p3=new Challenge2_25.Solution.ListNode(4);
        Challenge2_25.Solution.ListNode list3_p1=new Challenge2_25.Solution.ListNode(2);
        Challenge2_25.Solution.ListNode list3_p2=new Challenge2_25.Solution.ListNode(6);
        list1_p1.next=list1_p2;
        list1_p2.next=list1_p3;
        list1_p3.next=null;
        list.add(list1_p1);
        list2_p1.next=list2_p2;
        list2_p2.next=list2_p3;
        list2_p3.next=null;
        list.add(list2_p1);
        list3_p1.next=list3_p2;
        list3_p2.next=null;
        list.add(list3_p1);
        listNodes = list.toArray(new Challenge2_25.Solution.ListNode[0]);
    }

    @Test
    void shortTimeTest1(){
        assertTimeoutPreemptively(Duration.ofMillis(40),()->{
            Challenge2_25.Solution.ListNode testing=mergeKLists(listNodes);
        });
    }

    @Test
    void okTest1(){
        assertDoesNotThrow(()->{
            Challenge2_25.Solution.ListNode testing=mergeKLists(listNodes);
        });
    }

}