package raw;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge2_1 {
    public static void range(long decimal_number){
        //算10的308次方如何转换为2进制
        //初始化
        long temp= decimal_number;
        ArrayList <Byte> list= new ArrayList<>();
        //第一步，先写循环
        while(temp!=0){
            list.add((byte)(temp%2));
            temp/=2;
        }
        //第二步，反转得到二进制数
        Collections.reverse(list);
        //输出想要的格式
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        long test_case=10000;
        range(test_case);
    }
}
