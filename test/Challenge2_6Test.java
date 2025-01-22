package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Challenge2_6.findMedianSortedArrays;

class Challenge2_6Test {

    @Test
    void findMedianSortedArrays_simple_test1_true() {
        int [] nums1={1,3};
        int [] nums2={2};
        double result=findMedianSortedArrays(nums1,nums2);
        assertEquals(2.00000,result);
    }

    @Test
    void findMedianSortedArrays_simple_test2_true() {
        int [] nums1={1,2};
        int [] nums2={3,4};
        double result=findMedianSortedArrays(nums1,nums2);
        assertEquals(2.50000,result);
    }
}