package test.C2.C2_15;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import raw.Chapter2.Challenge2_15;

import java.time.Duration;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_15.Solution.swapPairs;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_15Test {

    @Test
    @Order(1)
    void onlyTwo() {
        Challenge2_15.Solution.ListNode head = new Challenge2_15.Solution.ListNode(1);
        Challenge2_15.Solution.ListNode p2 = new Challenge2_15.Solution.ListNode(2);
        head.next = p2;
        p2.next = null;
        Integer[] list1 = {2, 1};
        Challenge2_15.Solution.ListNode result = swapPairs(head);
        Challenge2_15.Solution.ListNode t = result;
        ArrayList<Integer> list2 = new ArrayList<>();
        while (t != null) {
            list2.add(t.val);
            t = t.next;
        }
        assertArrayEquals(list1, list2.toArray());
    }

    @Test
    @Order(2)
    void onlyFour() {
        assertTimeoutPreemptively(Duration.ofMillis(40), () -> {
            Challenge2_15.Solution.ListNode head = new Challenge2_15.Solution.ListNode(1);
            Challenge2_15.Solution.ListNode p2 = new Challenge2_15.Solution.ListNode(2);
            Challenge2_15.Solution.ListNode p3 = new Challenge2_15.Solution.ListNode(3);
            Challenge2_15.Solution.ListNode p4 = new Challenge2_15.Solution.ListNode(4);
            head.next = p2;
            p2.next = p3;
            p3.next = p4;
            p4.next = null;
            Integer[] list1 = {2, 1, 4, 3};
            Challenge2_15.Solution.ListNode result;
            result = swapPairs(head);
            Challenge2_15.Solution.ListNode t = result;
            ArrayList<Integer> list2 = new ArrayList<>();
            while (t != null) {
                list2.add(t.val);
                t = t.next;
            }
            assertArrayEquals(list1, list2.toArray());
        });
    }


    @Test
    @Order(3)
    void onlySix() {
        assertTimeoutPreemptively(Duration.ofMillis(4), () -> {
            Challenge2_15.Solution.ListNode head = new Challenge2_15.Solution.ListNode(1);
            Challenge2_15.Solution.ListNode p2 = new Challenge2_15.Solution.ListNode(2);
            Challenge2_15.Solution.ListNode p3 = new Challenge2_15.Solution.ListNode(3);
            Challenge2_15.Solution.ListNode p4 = new Challenge2_15.Solution.ListNode(4);
            Challenge2_15.Solution.ListNode p5 = new Challenge2_15.Solution.ListNode(5);
            Challenge2_15.Solution.ListNode p6 = new Challenge2_15.Solution.ListNode(6);
            head.next = p2;
            p2.next = p3;
            p3.next = p4;
            p4.next = p5;
            p5.next = p6;
            p6.next = null;
            Integer[] list1 = {2, 1, 4, 3, 6, 5};
            Challenge2_15.Solution.ListNode result = swapPairs(head);
            Challenge2_15.Solution.ListNode t = result;
            ArrayList<Integer> list2 = new ArrayList<>();
            while (t != null) {
                list2.add(t.val);
                t = t.next;
            }
            assertArrayEquals(list1, list2.toArray());
        });

    }

    @Test
    @Order(4)
    void onlyThree(){
        Challenge2_15.Solution.ListNode head=new Challenge2_15.Solution.ListNode(1);
        Challenge2_15.Solution.ListNode p2=new Challenge2_15.Solution.ListNode(2);
        Challenge2_15.Solution.ListNode p3=new Challenge2_15.Solution.ListNode(3);
        head.next=p2;
        p2.next=p3;
        p3.next=null;
        Integer[] list1 = {2,1,3};
        Challenge2_15.Solution.ListNode result=swapPairs(head);
        Challenge2_15.Solution.ListNode t = result;
        ArrayList<Integer> list2 = new ArrayList<>();
        while (t != null) {
            list2.add(t.val);
            t = t.next;
        }
        assertArrayEquals(list1, list2.toArray());
    }

    @Test
    @Order(5)
    void onlyFive(){
        Challenge2_15.Solution.ListNode head=new Challenge2_15.Solution.ListNode(1);
        Challenge2_15.Solution.ListNode p2=new Challenge2_15.Solution.ListNode(2);
        Challenge2_15.Solution.ListNode p3=new Challenge2_15.Solution.ListNode(3);
        Challenge2_15.Solution.ListNode p4=new Challenge2_15.Solution.ListNode(4);
        Challenge2_15.Solution.ListNode p5=new Challenge2_15.Solution.ListNode(5);
        head.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=null;
        Integer[] list1 = {2,1,4,3,5};
        Challenge2_15.Solution.ListNode result=swapPairs(head);
        Challenge2_15.Solution.ListNode t = result;
        ArrayList<Integer> list2 = new ArrayList<>();
        while (t != null) {
            list2.add(t.val);
            t = t.next;
        }
        assertArrayEquals(list1, list2.toArray());
    }

    @Test
    @Order(5)
    void onlySeven(){
        Challenge2_15.Solution.ListNode head=new Challenge2_15.Solution.ListNode(1);
        Challenge2_15.Solution.ListNode p2=new Challenge2_15.Solution.ListNode(2);
        Challenge2_15.Solution.ListNode p3=new Challenge2_15.Solution.ListNode(3);
        Challenge2_15.Solution.ListNode p4=new Challenge2_15.Solution.ListNode(4);
        Challenge2_15.Solution.ListNode p5=new Challenge2_15.Solution.ListNode(5);
        Challenge2_15.Solution.ListNode p6=new Challenge2_15.Solution.ListNode(6);
        Challenge2_15.Solution.ListNode p7=new Challenge2_15.Solution.ListNode(7);
        head.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=p5;
        p5.next=p6;
        p6.next=p7;
        p7.next=null;
        Integer[] list1 = {2,1,4,3,6,5,7};
        Challenge2_15.Solution.ListNode result=swapPairs(head);
        Challenge2_15.Solution.ListNode t = result;
        ArrayList<Integer> list2 = new ArrayList<>();
        while (t != null) {
            list2.add(t.val);
            t = t.next;
        }
        assertArrayEquals(list1, list2.toArray());
    }

}