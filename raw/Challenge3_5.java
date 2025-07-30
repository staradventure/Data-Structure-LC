package raw;

import java.util.*;
import java.util.stream.Collectors;


public class Challenge3_5 {
    public static class Solution {
        public static boolean validateStackSequences(int[] pushed, int[] popped) {
            int len = pushed.length + popped.length;
            ArrayList<Integer> pushed_list= new ArrayList<Integer>(Arrays.stream(pushed).boxed().collect(Collectors.toList()));
            ArrayList<Integer> popped_list= new ArrayList<Integer>(Arrays.stream(popped).boxed().collect(Collectors.toList()));
            ArrayList<Integer> list=new ArrayList<>();//一个比特中，0表示这一次入栈，1表示这一次出栈。
            LinkedList<Integer> pushed_queue=new LinkedList<>(pushed_list);
            LinkedList<Integer> popped_queue=new LinkedList<>(popped_list);
            //编写记录的位数
            if(list.isEmpty()){
                list.add(0);
            }
            Boolean main_flag=false;
            while(true){
                if(exeMethod(pushed_queue,popped_queue,list)){
                    main_flag=true;
                    break;
                }
                else {
                    adding();
                }
            }
            return main_flag;
        }

        //把list写上下一组可能性。
        private static void adding() {

        }

        //执行每一种可能性
        private static Boolean exeMethod(LinkedList<Integer> pushed_queue,LinkedList<Integer> popped_queue,ArrayList<Integer> list) {
            Stack<Integer> stack=new Stack<>();
            Boolean flag=true;
            for(int i=0;i<list.size();i++){
                if(list.get(i)==0){//也就是说，这一次要入栈
                    stack.push(pushed_queue.pop());
                }
                else if(list.get(i)==1){//也就是说，这一次要出栈
                    int temp=stack.pop();
                    if(temp==popped_queue.peek()){//这次的出栈序列是可以继续模拟的
                        popped_queue.pop();
                    }
                    else{
                        flag=false;
                        break;
                    }
                }
            }
            return flag;
        }

    }
}
