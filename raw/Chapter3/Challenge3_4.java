package raw.Chapter3;

import java.util.*;

public class Challenge3_4 {
    public static class Solution {
        public static String minRemoveToMakeValid(String s) {
            int count=0;
            boolean flag=false;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    count++;
                }
                if(s.charAt(i)==')'){
                    count--;
                }
                if(count<0){
                    flag=true;
                }
            }
            if(count==0&&flag==false){
                return s;
            }
            else{
                ArrayList<Integer> list=new ArrayList<>();
                Stack<Integer> stack=new Stack<>();
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)=='('){
                        stack.push(i);
                    }
                    if(s.charAt(i)==')'){
                        if(stack.isEmpty()){
                            list.add(i);
                        }
                        else{
                            stack.pop();
                        }
                    }
                }
                while(!stack.isEmpty()){
                    list.add(stack.pop());
                }
                ArrayList<Integer> list2=new ArrayList<>();
                for(int i=0;i<s.length();i++){
                    if(list.contains(i)){
                        continue;
                    }
                    list2.add(i);
                }
                StringBuilder builder=new StringBuilder();
                for(Integer number:list2){
                    builder.append(s.charAt(number));
                }
                return String.valueOf(builder);
            }
        }
    }
}
