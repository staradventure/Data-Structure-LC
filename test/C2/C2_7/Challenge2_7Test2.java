package test.C2.C2_7;

import org.junit.jupiter.api.*;
import raw.Chapter2.Challenge2_7;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Challenge2_7Test2 {
    static Challenge2_7.MyLinkedList myLinkedList = new Challenge2_7.MyLinkedList();
    @Test
    @Order(1)
    void simple_test1() {
        myLinkedList.addAtHead(1);
        assertEquals(1, myLinkedList.get(0));
    }
    @Test
    @Order(2)
    void simple_test2() {
        myLinkedList.deleteAtIndex(0);
    }
  
}