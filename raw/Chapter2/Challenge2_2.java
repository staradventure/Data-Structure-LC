package raw.Chapter2;

public class Challenge2_2 {
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
