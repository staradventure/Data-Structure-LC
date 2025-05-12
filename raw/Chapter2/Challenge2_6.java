package raw.Chapter2;

import java.util.ArrayList;

public class Challenge2_6 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //二路归并算法
        ArrayList<Integer> nums3=new ArrayList<>();
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                nums3.add(nums1[i]);
                i++;
            }
            else{
                nums3.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length){
            nums3.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            nums3.add(nums2[j]);
            j++;
        }
        //求中位数
        if((nums1.length+ nums2.length)%2==0){
            return ((nums3.get((nums3.size() / 2)-1) + nums3.get((nums3.size() / 2 + 1)-1)) /2.0);
        }
        else {
            return (double) nums3.get(((nums3.size()/2)+1)-1);
        }
    }

}
