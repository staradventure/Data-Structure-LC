package test.C2.C2_7;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import raw.Chapter2.Challenge2_7;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Challenge2_7Test4 {

    static Challenge2_7.MyLinkedList myLinkedList=new Challenge2_7.MyLinkedList();

    @Test
    @Order(1)
    void simple_test1(){
        myLinkedList.addAtHead(9);
        assertEquals(9,myLinkedList.get(0));
    }
    @Test
    @Order(2)
    void simple_test2(){
        assertEquals(-1,myLinkedList.get(1));
    }

    @Test
    @Order(3)
    void simple_test3(){
        myLinkedList.addAtIndex(1,1);
        assertEquals(1,myLinkedList.get(1));
    }

    @Test
    @Order(4)
    void simple_test4(){
        myLinkedList.addAtIndex(1,7);
        assertEquals(7,myLinkedList.get(1));
    }

    @Test
    @Order(5)
    void simple_test5(){
        try {
            myLinkedList.deleteAtIndex(1);
        } catch (Exception e) {
            assertTrue(false);
        }
        assertTrue(true);
    }

    @Test
    @Order(6)
    void simple_test6(){
        myLinkedList.addAtHead(7);
        assertEquals(7,myLinkedList.get(0));
    }

    @Test
    @Order(7)
    void simple_test7(){
        myLinkedList.addAtHead(4);
        assertEquals(4,myLinkedList.get(0));
    }

    @Test
    @Order(8)
    void simple_test8(){
        assertDoesNotThrow(()-> myLinkedList.deleteAtIndex(1));
    }

    @Test
    @Order(9)
    void simple_test9(){
        myLinkedList.addAtIndex(1,4);
        assertEquals(4,myLinkedList.get(1));
    }

    @Test
    @Order(10)
    void simple_test10(){
        myLinkedList.addAtHead(2);
        assertEquals(2,myLinkedList.get(0));
    }

    @Test
    @Order(11)
    void simple_test11(){
        assertDoesNotThrow(()-> myLinkedList.deleteAtIndex(5));

    }

}