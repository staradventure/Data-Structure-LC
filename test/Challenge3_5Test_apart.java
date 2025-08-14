package test;

import org.junit.jupiter.api.Test;
import raw.Challenge3_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Challenge3_5Test_apart {

    @Test
    void partiExeMethodTest1(){
        int num=47;
        String binaryStr = Integer.toBinaryString(num);
        int[] bits = binaryStr.chars().map(c -> c - '0').toArray();
        ArrayList<Integer> list=new ArrayList<>();
        for (int bit : bits) {
            list.add(bit);
        }
        System.out.println(list);//[1, 0, 1, 1, 1, 1]


        int bit_nums=10;
        String binaryStr_bit = "0".repeat(bit_nums);
        int zeros = Integer.parseInt(binaryStr_bit, 2);
        System.out.println(zeros); // 输出结果
        int result_num=zeros | num;
        String binaryStr_update = String.format("%" + bit_nums + "s", Integer.toBinaryString(result_num)).replace(' ', '0');
        System.out.println(binaryStr_update);
        list.clear();
        int[] bit_update = binaryStr_update.chars().map(c -> c - '0').toArray();
        for (int bit : bit_update) {
            list.add(bit);
        }
        System.out.println(list);

        int [] pushed={1,2,3,4,5};
        int [] popped={4,5,3,2,1};
        ArrayList<Integer> pushed_list = new ArrayList<Integer>(Arrays.stream(pushed).boxed().collect(Collectors.toList()));
        ArrayList<Integer> popped_list = new ArrayList<Integer>(Arrays.stream(popped).boxed().collect(Collectors.toList()));
        Boolean actual=Challenge3_5.Solution.exeMethod(popped_list,pushed_list,list);
        Boolean expected = true;
        assertEquals(expected,actual);
    }

}