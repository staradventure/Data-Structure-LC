package test.C3.C3_1;

import org.junit.jupiter.api.Test;
import raw.Chapter3.Challenge3_1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class Challenge3_1Test {
    Challenge3_1.CustomStack stack=null;

    @Test
    void ok_test1(){
        assertDoesNotThrow(()->{
            stack = new Challenge3_1.CustomStack(3);
            stack.push(1);
            stack.push(2);
            stack.pop();
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.increment(5,100);
            stack.increment(2,100);
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
        });


    }

}