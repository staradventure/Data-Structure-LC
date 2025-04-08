package raw;

public class Challenge2_24 {
    public class Solution {
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode p=list1;
            ListNode q=list2;
            ListNode c =new ListNode();
            ListNode t=new ListNode();
            c.next=t;
            while(p!=null&&q!=null){
                if(p.val<q.val){
                    t.next=p;
                    t=p;
                    p=p.next;
                }
                else{
                    t.next=q;
                    t=q;
                    q=q.next;
                }
            }
            t.next=null;
            if(p!=null){
                t.next=p;
            }
            if(q!=null){
                t.next=q;
            }
            return c.next.next;
        }

        public static class ListNode {
            public int val;
            public ListNode next;

            public ListNode() {
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
