package raw.Chapter2;

import java.util.ArrayList;

public class Challenge2_21 {
    public class Solution {
        public static ListNode[] splitListToParts(ListNode head, int k) {
            ArrayList<ListNode> list= new ArrayList<>();
            ListNode p=head;
            while(p!=null){
                list.add(p);
                p=p.next;
            }
            int amount = list.size();
            ArrayList<Integer> split_numbers=new ArrayList<>();
            int n1=amount/k;//k是几部分，n1是每部分里面有多少个数……
            int n2=amount%k;//n2是余数，应该被均匀地分开
            for(int i=0;i<k;i++){
                split_numbers.add(n1);
            }
            for(int i=0;i<n2;i++){
                split_numbers.set(i,split_numbers.get(i)+1);
            }
            //构建数组
            ArrayList<ListNode> temp_list=new ArrayList<>();
            int count=0;
            for(int i=0;i<split_numbers.size();i++){
                if (split_numbers.get(i)>0) {
                    temp_list.add(list.get(count));
                    for(int j=0;j<split_numbers.get(i);j++){
                        count++;
                    }
                    ListNode temp=list.get(count-1);
                    temp.next=null;
                }
                else{
                    temp_list.add(null);
                }
            }
            return temp_list.toArray(new ListNode[0]);
        }
        public static class ListNode {
            int val;
            public ListNode next;

            ListNode() {
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
