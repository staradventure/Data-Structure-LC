package test.C2.C2_8;

import org.junit.jupiter.api.*;
import raw.Chapter2.Challenge2_8;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_8.Solution.list;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Challenge2_8Test2 {
    static Challenge2_8.Solution.ListNode head;
    Challenge2_8.Solution s;
    @BeforeAll
    static void setup(){
        head=new Challenge2_8.Solution.ListNode(1);
        head.next=null;
    }

    @Test
    @Order(1)
    void constructor_test(){
        s=new Challenge2_8.Solution(head);
        Integer[] expected = {1};
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