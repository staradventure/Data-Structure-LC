package raw.Chapter1;

import java.util.ArrayList;

public class Challenge1_4 {

    public static int sumOddLengthSubarrays(int[] arr) {
        //第一步，求所有长度。
        int max=arr.length%2==1?arr.length:arr.length-1;
        ArrayList<Integer> items =new ArrayList<>();
        for(int i=1;i<=max;i+=2){
            items.add(i);
        }
        //第二步，按照每个长度穷举。
        int result=0;
        for(Integer item: items){//现在开始进入第一层循环，对每个长度：
            for(int i=0;i<=arr.length-item;i++){
                for(int j=i;j<i+item;j++){
                    result+=arr[j];
                }
            }

        }
        return result;
    }
}
