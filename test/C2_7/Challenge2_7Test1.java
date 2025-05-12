package test.C2_7;

import org.junit.jupiter.api.*;
import raw.Chapter2.Challenge2_7;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Challenge2_7Test1 {
    static Challenge2_7.MyLinkedList myLinkedList = new Challenge2_7.MyLinkedList();


    @Test
    @Order(1)
    void check_content1_test(){
        myLinkedList.addAtHead(1);
        assertEquals(1,myLinkedList.get(0));// 返回 1
    }

    @Test
    @Order(2)
    void simple_test2(){
        myLinkedList.addAtTail(3);
        myLinkedList.addAtIndex(1, 2);// 链表变为 1->2->3
        int case_1=myLinkedList.get(1);
        assertEquals(2,case_1);// 返回 2

    }

    @Test
    @Order(3)
    void simple_test3(){
        myLinkedList.deleteAtIndex(1);    // 现在，链表变为 1->3
        assertEquals(3,myLinkedList.get(1));// 返回 3
    }
}