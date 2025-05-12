package raw.Chapter2;

public class Challenge2_18 {
    public class Solution {
        /**
         * 这个可能存在引用的对象值被改变的问题
         * @param head
         */
        public static void reorderList(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            while(fast.next!=null&&fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode A=head;
            ListNode p=slow.next,q;
            ListNode B=null;
            slow.next=null;
            while(p!=null){
                q=p.next;
                p.next=B;
                B=p;
                p=q;
            }
            //A分表和B分表都已经建成。
            ListNode s,t;
            s=A;
            t=s.next;
            //挨个插节点
            ListNode m,n,c;
            m=B;
            while(m!=null) {
                n = m;
                c=m.next;
                s.next = n;
                n.next = t;
                s = t;
                if(t!=null) {
                    t = t.next;
                }
                m = c;
            }
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
