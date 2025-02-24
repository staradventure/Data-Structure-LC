package raw;

import java.util.ArrayList;

public class Challenge2_19 {
    public static class Solution {
        public static ListNode insertionSortList(ListNode head) {
            ArrayList<Integer> list =new ArrayList<>();
            ListNode t=head;
            while(t!=null){
                list.add(t.val);
                t=t.next;
            }
            Integer temp;
            int j;
            for(int i=1;i<list.size();i++){
                if(list.get(i)<list.get(i-1)){
                    temp=list.get(i);
                    j=i-1;
                    do{
                        list.set(j+1,list.get(j));
                        j--;
                    }while(j>=0&&list.get(j)>temp);
                    list.set(j+1,temp);
                }
            }
            //使用尾插法建表
            ListNode s,u,result=null;
            u=result;
            for(int i=0;i<list.size();i++){
                s=new ListNode(list.get(i));
                if(i==0){
                    result=s;
                }
                else {
                    u.next = s;
                }
                u=s;
            }
            u.next=null;
            return result;
        }

        public static class ListNode {
            public int val;
            public ListNode next;

            public ListNode() {
            }

            public ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
    }
}
