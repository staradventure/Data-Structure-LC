import java.util.Arrays;

public class Challenge2_2 {
    public static void main(String[] args) {
        int [] nums={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
        System.out.println(Arrays.toString(nums));
    }
    public static int removeElement(int[] nums, int val){
        int size=nums.length;
        int i=0,k=0;
        for(i=0;i<size;i++){
            if(val!=nums[i]){
                nums[i-k]=nums[i];
            }
            else k++;
        }
        return size-k;
    }
}
