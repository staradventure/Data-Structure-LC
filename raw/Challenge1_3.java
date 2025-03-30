package raw;

public class Challenge1_3 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    int temp=nums[i]+nums[j];
                    if(target==temp){
                        int[] answer={i,j};
                        return answer;
                    }
                }
            }
            return null;
        }
    }
}
