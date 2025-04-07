package raw;

import java.util.ArrayList;

public class Challenge2_23 {
    public class Solution {
        public static ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return null;
            }
            if (head.next == null) {
                return head;
            }
            ListNode p = head;
            ListNode q = p.next;
            ArrayList<Integer> list = new ArrayList<>();
            while (q != null && p != null) {
                if (p.val == q.val) {
                    if(!list.contains(p.val)) {
                        list.add(p.val);
                    }
                    q = q.next;
                } else {
                    p = q;
                    q = q.next;
                }
            }
            ListNode t=new ListNode();
            t.next=head;
            while (t.next.next!= null) {
                if (list.contains(t.next.val)){
                    t.next=t.next.next;
                }
                else{
                    break;
                }
            }
            head=t.next;
            if(list.contains(head.val)){
                return null;
            }
            ListNode m1=head;
            ListNode m2=m1.next;
            while(m2!=null){
                if(list.contains(m2.val)){
                    m1.next=m2.next;
                    m2=m2.next;
                }
                else{
                    m2=m2.next;
                    m1=m1.next;
                }
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

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
    }
}
