package test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import raw.Challenge2_7;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_7Test3 {
    static Challenge2_7.MyLinkedList myLinkedList = new Challenge2_7.MyLinkedList();
    @Test
    @Order(1)
    void simple_test1() {
        myLinkedList.addAtHead(2);
        assertEquals(2, myLinkedList.get(0));
    }
    @Test
    @Order(2)
    void simple_test2() {
        myLinkedList.deleteAtIndex(1);
        myLinkedList.addAtHead(2);
        assertEquals(2, myLinkedList.get(0));
    }

    @Test
    @Order(3)
    void simple_test3() {
        myLinkedList.addAtHead(7);
        assertEquals(7, myLinkedList.get(0));
    }

    @Test
    @Order(4)
    void simple_test4() {
        myLinkedList.addAtHead(3);
        assertEquals(3, myLinkedList.get(0));
    }

    @Test
    @Order(5)
    void simple_test5() {
        myLinkedList.addAtHead(2);
        assertEquals(2, myLinkedList.get(0));
    }

    @Test
    @Order(6)
    void simple_test6() {
        myLinkedList.addAtHead(5);
        assertEquals(5, myLinkedList.get(0));
    }
    @Test
    @Order(7)
    void simple_test7() {
        myLinkedList.addAtTail(5);
        assertEquals(5, myLinkedList.get(myLinkedList.getLength()-1));
    }
    @Test
    @Order(8)
    void simple_test8() {
        myLinkedList.deleteAtIndex(6);
    }
    @Test
    @Order(9)
    void simple_test9() {
        myLinkedList.deleteAtIndex(4);
    }

}