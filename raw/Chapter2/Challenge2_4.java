package raw.Chapter2;

public class Challenge2_4 {
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
            int middle=i+1;
            int actual_amount=amount-1;
            if(amount>1){
                for (int k = middle + actual_amount; k < temp; k++) {
                    nums[k - actual_amount] = nums[k];
                }
                temp = temp - actual_amount;
            }
        }
        int result = temp;
        return result;
    }
}
