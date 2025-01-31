package raw;

public class Challenge2_11 {
    public class Solution {
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

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
    }


}
