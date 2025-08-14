package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Challenge3_5.Solution.validateStackSequences;

class Challenge3_5Test {
    @Test
    void simpleTest1(){
        int [] pushed={1,2,3,4,5};
        int [] popped={4,5,3,2,1};
        Boolean actual=validateStackSequences(pushed,popped);
        Boolean expected=true;
        assertEquals(expected,actual);
    }

    @Test
    void simpleTest2(){
        int [] pushed={1,2,3,4,5};
        int [] popped={4,3,5,1,2};
        Boolean actual=validateStackSequences(pushed,popped);
        Boolean expected=false;
        assertEquals(expected,actual);
    }

    @Test
    void simpleTest3(){
        int [] pushed={0};
        int [] popped={0};
        Boolean actual=validateStackSequences(pushed,popped);
        Boolean expected=true;
        assertEquals(expected,actual);
    }

}