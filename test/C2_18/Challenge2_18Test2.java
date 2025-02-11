package test.C2_18;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import raw.Challenge2_18;

import java.time.Duration;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static raw.Challenge2_18.Solution.reorderList;

class Challenge2_18Test2 {

    static Challenge2_18.Solution.ListNode head;

    @BeforeAll
    static void createList(){
        head=new Challenge2_18.Solution.ListNode(1);
        Challenge2_18.Solution.ListNode p2 = new Challenge2_18.Solution.ListNode(2);
        Challenge2_18.Solution.ListNode p3 = new Challenge2_18.Solution.ListNode(3);
        Challenge2_18.Solution.ListNode p4 = new Challenge2_18.Solution.ListNode(4);
        head.next=p2;
        p2.next=p3;
        p3.next=p4;
        p4.next=null;
    }

    @Test
    void runningFine(){
        assertTimeoutPreemptively(Duration.ofMillis(40),()->{reorderList(head);});

    }

    @Test
    void insertCorrect1(){
        ArrayList<Integer> list=new ArrayList<>();
        Challenge2_18.Solution.ListNode t=head;
        while(t!=null){
            list.add(t.val);
            t=t.next;
        }
        assertArrayEquals(new Integer[] {1,4,2,3},list.toArray(new Integer[0]));
    }

}