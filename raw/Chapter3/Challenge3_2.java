package raw.Chapter3;

import java.util.ArrayList;
import java.util.Stack;

public class Challenge3_2 {
    public static class MinStack {

        ArrayList<Integer> data;
        Stack<Integer> answer;

        public MinStack() {
            answer = new Stack<>();
            data=new ArrayList<>();
        }

        public void push(int val) {
            answer.push(val);
            data.add(val);
            data.sort(Integer::compareTo);
        }

        public void pop() {
            if (answer.isEmpty()) return;
            Integer element = answer.pop();
            data.remove(element);
            data.sort(Integer::compareTo);
        }

        public int top() {
            if (answer.isEmpty()) return Integer.MIN_VALUE;//这里实际上不应该返回这个int的最小值，因为最小值也在栈的正常取值范围中。
            return answer.get(data.size() - 1);
        }

        public int getMin() {
            return data.get(0);
        }
    }
}
