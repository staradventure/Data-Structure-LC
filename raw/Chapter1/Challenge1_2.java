package raw.Chapter1;
import java.math.BigInteger;

public class Challenge1_2 {
    class Solution {
        public int[] plusOne(int[] digits) {
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=0;i<digits.length;i++){
                stringBuilder.append(digits[i]);
            }
            BigInteger number=new BigInteger(stringBuilder.toString());
            number=number.add(new BigInteger("1"));
            String string=String.valueOf(number);
            int[] result=new int[string.length()];
            for(int i=0;i<string.length();i++){
                result[i]=Integer.parseInt(string.substring(i, i+1));
            }
            return result;
        }
    }
}
