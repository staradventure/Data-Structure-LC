package raw.Chapter2;

public class Challenge2_5 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int count = m;
        while (i < count && j < n) {
            if (nums1[i] >= nums2[j]) {
                //把后面的元素往后挪
                int k = m + n - 1;
                for (; k > i; k--) {
                    nums1[k] = nums1[k - 1];
                }
                //插入元素
                nums1[i] = nums2[j];
                j++;
                i++;
                count++;

            } else {
                if (nums1[i + 1] >= nums2[j]) {
                    //挪元素
                    if (nums1[i] <= nums2[j]) {
                        //把后面的元素往后挪
                        int k = m + n - 1;
                        for (; k > i + 1; k--) {
                            nums1[k] = nums1[k - 1];
                        }
                        //插入元素
                        nums1[i + 1] = nums2[j];
                        j++;
                        i++;
                        count++;
                    }
                } else if (nums1[i + 1] < nums2[j]) {
                    i++;
                }
            }

        }
        while (j < n) {
            //把剩下的元素挪过来
            nums1[i++] = nums2[j];
            j++;
        }
    }
}
