package test.C3.C3_2;

import org.junit.jupiter.api.Test;
import raw.Chapter3.Challenge3_2;

import static org.junit.jupiter.api.Assertions.*;

class Challenge3_2Test {

    @Test
    void simpleTest1(){
        Challenge3_2.MinStack stack=new Challenge3_2.MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-1);
        assertEquals (-2,stack.getMin());
        assertEquals(-1,stack.top());
        stack.pop();
        assertEquals(-2,stack.getMin());
    }

}