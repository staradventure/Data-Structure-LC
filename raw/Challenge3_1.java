package raw;

public class Challenge3_1 {
    public static class CustomStack {
        int [] data;
        int top;
        int capacity;
        public CustomStack(int maxSize) {
            data = new int[maxSize];
            top=-1;
            capacity=maxSize;
        }

        public void push(int x) {
            if(top<capacity-1){//栈还没有满
                data[++top]=x;
            }
        }

        public int pop() {
            if(top==-1){
                return -1;
            }
            int element=data[top];
            data[top--]=0;
            return element;
        }

        public void increment(int k, int val) {
            if(k<top+1){
                for(int i=0;i<k;i++){
                    data[i]+=val;
                }
            }
            else{
                for(int i=0;i<=top;i++){
                    data[i]+=val;
                }
            }

        }
    }
}
