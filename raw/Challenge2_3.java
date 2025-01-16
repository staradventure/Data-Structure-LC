package raw;

import java.util.Arrays;

public class Challenge2_3 {
    public static int removeDuplicates(int[] nums) {
        int size = nums.length;
        int temp = size;
        for (int i = 0; i < temp; i++) {
            if (temp - i == 1) {
                break;
            }
            int j = i + 1;
            int amount = 0;
            while (j < temp && nums[j] == nums[i]) {
                amount++;
                j++;
            }
            for (int k = i + amount; k < temp; k++) {
                nums[k - amount] = nums[k];
            }
            temp = temp - amount;
        }
        int result = temp;
        return result;
    }

    public static void main(String[] args) {
//        int [] nums={0,0,1,1,1,2,2,3,3,4};
//        int [] nums={1,1,2};
//        int [] nums= {1,1};
        int[] nums = {1, 1, 1};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
