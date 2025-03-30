package raw;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Challenge2_1 {
    class Solution {
        public String addBinary(String a, String b) {
            BigInteger a_form =new BigInteger(a,2);
            BigInteger b_form =new BigInteger(b,2);
            BigInteger result_form=a_form.add(b_form);
            return result_form.toString(2);
        }
    }
}
