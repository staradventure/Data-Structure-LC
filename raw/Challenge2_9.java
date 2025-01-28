package raw;

public class Challenge2_9 {
    public class Solution {
        public static ListNode removeElements(ListNode head, int val) {
            if (head == null) {
                return null;
            }
            if (head.val == val) {
                ListNode p = head;
                while (p!=null&&p.val == val) {
                    p = p.next;
                }
                if(p==null){
                    return null;
                }
                head = p;
                if (head != null) {
                    sub_remove(head, val);
                }
            } else {
                sub_remove(head, val);
            }
            return head;
        }

        public static void sub_remove(ListNode head, int val) {
            ListNode s = head;
            ListNode m = head.next;
            while (m != null) {
                if (m.val == val) {
                    s.next = m.next;
                    m = m.next;
                } else {
                    s = s.next;
                    m = m.next;
                }
            }
        }

        public static class ListNode {
            int val;
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
