package raw;

import java.util.Stack;

public class Challenge3_3 {
    public static class Solution{
        public static boolean isValid(String s){
            int i=0;
            char e,x;
            Stack <Character> stack=new Stack<>();
            while(i<s.length()){
                e=s.charAt(i);
                if(e=='('||e=='['||e=='{'){
                    stack.push(e);
                }
                else{

                }
            }
        }
    }
}
