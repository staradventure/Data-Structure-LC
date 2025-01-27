package test.C2_8;

import org.junit.jupiter.api.*;
import raw.Challenge2_8;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Challenge2_8.Solution.list;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_8Test1 {
    static Challenge2_8.Solution.ListNode head;
    Challenge2_8.Solution s;
    @BeforeAll
    static void setup(){
        head=new Challenge2_8.Solution.ListNode(1);
        Challenge2_8.Solution.ListNode p2=new Challenge2_8.Solution.ListNode(2);
        Challenge2_8.Solution.ListNode p3=new Challenge2_8.Solution.ListNode(3);
        head.next=p2;
        p2.next=p3;
        p3.next=null;
    }

    @Test
    @Order(1)
    void constructor_test(){
        s=new Challenge2_8.Solution(head);
        Integer[] expected = {1, 2, 3};
        Integer[] actual = list.toArray(new Integer[0]);
        assertArrayEquals(expected, actual);

    }

    /**
     * 测试list长度是否正常
     */
    @Test
    @Order(2)
    void getRandom_test_length(){
        Challenge2_8.Solution.ListNode p;
        p=head;
        int count=0;
        while(p!=null){
            count++;
            p=p.next;
        }
        assertEquals(count,list.size());
    }

    /**
     * 测试getRandom是否能正常运行
     */
    @Test
    @Order(3)
    void getRandom_test_ok(){
        assertDoesNotThrow(()-> Challenge2_8.Solution.getRandom());
    }
  
}