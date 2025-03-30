package raw;
import java.lang.Math;

public class Challenge1_1 {
    class Solution {
        public int reverse(int x) {
            if(x==-(Math.pow(2, 31))){//这里直接写负号可能会报错。
                return 0;
            }
            if(x<0){
                char [] temp1 = String.valueOf(x).toCharArray();
                int length=temp1.length;
                StringBuilder temp2=new StringBuilder();
                temp2.append('-');
                for(int i=length-1;i!=0;i--){
                    temp2.append(temp1[i]);
                }
                int result;
                try{
                    result=Integer.parseInt(temp2.toString());
                }catch(NumberFormatException e){
                    return 0;
                }
                return result;
            }
            else{
                char [] temp1 = String.valueOf(x).toCharArray();
                int length=temp1.length;
                StringBuilder temp2=new StringBuilder();
                for(int i=length-1;i>=0;i--){
                    temp2.append(temp1[i]);
                }
                int result;
                try{
                    result=Integer.parseInt(temp2.toString());
                }catch(NumberFormatException e){
                    return 0;
                }
                return result;
            }
        }
    }
}
