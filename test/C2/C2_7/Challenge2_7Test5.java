package test.C2.C2_7;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import raw.Chapter2.Challenge2_7;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Challenge2_7Test5 {
    static Challenge2_7.MyLinkedList myLinkedList=new Challenge2_7.MyLinkedList();
    @Test
    @Order(1)
    void simple_test1(){
        myLinkedList.addAtHead(1);
        assertEquals(1,myLinkedList.get(0));
    }

    @Test
    @Order(2)
    void simple_test2(){
        myLinkedList.addAtTail(3);
        assertEquals(3,myLinkedList.get(1));
    }

    @Test
    @Order(3)
    void simple_test3(){
        assertDoesNotThrow(()->myLinkedList.addAtIndex(3,2));
    }

}