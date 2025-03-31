package test.C1_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter1.Challenge1_4.sumOddLengthSubarrays;

class Challenge1_4Test {

    @Test
    void simple_test1() {
        int [] arr={1,4,2,5,3};
        assertEquals(58,sumOddLengthSubarrays(arr));
    }
}