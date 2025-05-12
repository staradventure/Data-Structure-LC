package raw.Chapter2;

public class Challenge2_22 {
    public class Solution {
        public static ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return null;
            } else if (head.next == null) {
                return head;
            } else {
                ListNode p, q;
                p = q = head;
                p = p.next;
                while (p != null) {
                    if (p.val == q.val) {
                        q.next = p.next;
                        p = p.next;
                    } else {
                        q = p;
                        p = p.next;
                    }
                }
                return head;
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
