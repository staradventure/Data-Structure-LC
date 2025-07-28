package test.C3.C3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter3.Challenge3_4.Solution.minRemoveToMakeValid;

class Challenge3_4Test {

    @Test
    void simpleTest1(){
        String s="Leetcode";
        String result=minRemoveToMakeValid(s);
        char[] expected="Leetcode".toCharArray();
        char[] actual=result.toCharArray();
        assertArrayEquals(expected,actual);
    }




    @Test
    void simpleTest2(){
        String s="lee(t(c)o)de)";
        String result=minRemoveToMakeValid(s);
        char[] expected="lee(t(c)o)de".toCharArray();
        char[] actual=result.toCharArray();
        assertArrayEquals(expected,actual);
    }

    @Test
    void simpleTest3(){
        String s="))((";
        String result=minRemoveToMakeValid(s);
        char[] expected="".toCharArray();
        char[] actual=result.toCharArray();
        assertArrayEquals(expected,actual);
    }

}