package raw;

import java.util.ArrayList;
import java.util.Stack;


public class Challenge3_5 {
    public static class Solution {
        public static boolean validateStackSequences(int[] pushed, int[] popped) {
            int len = pushed.length + popped.length;
            ArrayList<Boolean> list=new ArrayList<>();
            //编写记录的位数
            if(list.isEmpty()){
                list.add(false);
            }
            Boolean flag=true;
            while(true){
                exeMethod(pushed,popped);
                adding();
            }
        }

        //把list写上下一组可能性。
        private static void adding() {
        }

        //执行每一种可能性
        private static void exeMethod(int[] pushed,int [] popped) {
            Stack<Integer> stack=new Stack<>();

        }

    }
}
