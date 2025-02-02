package raw;

public class Challenge2_14 {
    public static class Solution {
        public ListNode partition(ListNode head, int x) {
            if (head == null) {
                return null;
            }
            ListNode s = head;
            ListNode p1 = new ListNode();
            ListNode p2 = new ListNode();
            ListNode s1 = p1;
            ListNode s2 = p2;
            while (s != null) {
                if (s.val < x) {
                    s1.next = s;
                    s1 = s1.next;
                } else if (s.val >= x) {
                    s2.next = s;
                    s2 = s2.next;
                }
                s = s.next;
            }
            s1.next = null;
            s2.next = null;
            ListNode m = p1.next;
            if (m == null) {
                if (p2 != null) {
                    return p2.next;
                }
            }
            while (m.next != null) {
                m = m.next;
            }
            m.next = p2.next;
            return p1.next;
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
