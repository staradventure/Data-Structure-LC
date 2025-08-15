package raw.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.stream.Collectors;


public class Challenge3_5 {
    public static class Solution {
        public static boolean validateStackSequences(int[] pushed, int[] popped) {
            int  num =0b0;
            ArrayList<Integer> list;

            int bit_nums=pushed.length+popped.length;
            int len= (int)Math.pow(2,(double)pushed.length + popped.length);
            ArrayList<Integer> pushed_list = new ArrayList<Integer>(Arrays.stream(pushed).boxed().collect(Collectors.toList()));
            ArrayList<Integer> popped_list = new ArrayList<Integer>(Arrays.stream(popped).boxed().collect(Collectors.toList()));
            //一个比特中，0表示这一次入栈，1表示这一次出栈。

            String binaryStr = Integer.toBinaryString(num);
            int[] bits = binaryStr.chars().map(c -> c - '0').toArray();
            list = Arrays.stream(bits)
                    .boxed()
                    .collect(Collectors.toCollection(ArrayList::new));

            //编写记录的位数
            if (list.isEmpty()) {
                list.add(0);
            }
            while (true) {
                if (exeMethod(popped_list, pushed_list, list)) {
                    return true;
                } else {
                    num=num+1;
                    if (!adding(num, list, len,bit_nums)) {
                        return false;
                        //已经超过上限了，return false即可。
                    }
                }
            }
        }

        /**
         * 用二进制表示每一种可能性
         * @param num 二进制数
         * @param list 比特列
         * @param len 非确界的上限
         * @return num<=len的时候返回true，num>len的时候返回false
         */
        private static Boolean adding(int num,ArrayList<Integer> list, int len,int bit_nums) {
            String binaryStr_bit = "0".repeat(bit_nums);
            int zeros = Integer.parseInt(binaryStr_bit, 2);
            Integer result_num=zeros | num;
            String binaryStr_update = String.format("%" + bit_nums + "s", Integer.toBinaryString(result_num)).replace(' ', '0');
            list.clear();
            int[] bit_update = binaryStr_update.chars().map(c -> c - '0').toArray();
            for (int bit : bit_update) {
                list.add(bit);
            }

            if(num<=len){
                return true;
            }
            else{
                return false;
            }
        }

        //执行每一种可能性
        public static Boolean exeMethod(ArrayList<Integer> popped_list,ArrayList<Integer> pushed_list,ArrayList<Integer> list) {
            LinkedList<Integer> pushed_queue = new LinkedList<>(pushed_list);
            LinkedList<Integer> popped_queue = new LinkedList<>(popped_list);
            Stack<Integer> stack = new Stack<>();
            //这一段得确定当前list里的是否能成为最终解。
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == 0) {//也就是说，这一次要入栈
                    if(!pushed_queue.isEmpty())
                        stack.push(pushed_queue.pop());//给栈入栈
                    else
                        return false;
                } else if (list.get(i) == 1) {//也就是说，这一次要出栈
                    Integer value=popped_queue.poll();
                    if(value ==null)
                        return false;
                    if(stack.isEmpty())
                        return false;
                    if (value == stack.peek()) {//这次的出栈序列是可以继续模拟的
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

    }
}
