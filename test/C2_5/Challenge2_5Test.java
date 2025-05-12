package test.C2_5;

import static org.junit.jupiter.api.Assertions.*;
import static raw.Chapter2.Challenge2_5.merge;

class Challenge2_5Test {

    @org.junit.jupiter.api.Test
    void merge_simple_test1_true() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        assertArrayEquals (new int[] {1,2,2,3,5,6},nums1);
    }

    @org.junit.jupiter.api.Test
    void merge_simple_test2_true() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        merge(nums1, m, nums2, n);
        assertArrayEquals (new int[] {1},nums1);
    }

    @org.junit.jupiter.api.Test
    void merge_simple_test3_true() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
        assertArrayEquals (new int[] {1},nums1);
    }

    @org.junit.jupiter.api.Test
    void merge_simple_test4_true() {
        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
        assertArrayEquals (new int[] {1,2},nums1);
    }
}