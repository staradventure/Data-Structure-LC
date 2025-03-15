package raw;

import java.util.ArrayList;

public class Challenge2_20 {
    public static class Solution {
        public static ListNode reverseGroup(ListNode head,int k){
            ArrayList<ListNode> list= new ArrayList<>();
            ListNode p=head;
            while(p!=null){
                list.add(p);
                p=p.next;
            }
            ArrayList<Integer> list2=new ArrayList<>();
            int number1=list.size()/k;
            int number2= list.size()%k;
            for(int i=0;i<number1;i++){
                list2.add(k);
            }
            if(number2!=0){
                list2.add(number2);
            }
            int temp=0;
            while(temp<list2.size()&&list2.get(temp)!=number2){
                int count2=(temp+1)*k-1;
                ListNode p2=list.get(count2);
                p2.next=null;
                list.set(count2,p2);
                int count1=temp*k;
                ListNode result=reverseList(list.get(count1));
                ListNode p5=result;
                int goes=count1;
                while(p5!=null){
                    list.set(goes,p5);
                    p5=p5.next;
                    goes++;
                }
                temp++;
            }
            for(int i=0;i<list.size()-1;i++){
                ListNode p6=list.get(i);
                p6.next=list.get(i+1);
                list.set(i,p6);
            }
            return list.get(0);
        }
        public static ListNode reverseList(ListNode head) {
            ListNode p = head, q;
            head = null;
            while (p != null) {
                q = p.next;
                p.next=head;
                head=p;
                p = q;
            }
            return head;
        }
        public static class ListNode {
            public int val;
            public ListNode next;

            ListNode() {
            }

            public ListNode(int val) {
                this.val = val;
            }

            public ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
    }
}
