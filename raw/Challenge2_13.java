package raw;

import java.util.ArrayList;

public class Challenge2_13 {
    public class Solution {
        public static ListNode oddEvenList(ListNode head) {
            ArrayList<Integer> list_odd = new ArrayList<>();
            ArrayList<Integer> list_even = new ArrayList<>();
            int count = 1;
            ListNode p = head;
            while (p != null) {
                if (count % 2 == 1) {
                    list_odd.add(p.val);
                } else {
                    list_even.add(p.val);
                }
                p = p.next;
                count++;
            }
            count--;
            ListNode s = head;
            int index = 0;
            int odd_amount;
            int even_amount;
            if (count % 2 == 0) {
                odd_amount = even_amount = count / 2;
            } else {
                odd_amount = count / 2 + 1;
                even_amount = count / 2;
            }
            while (index < odd_amount) {
                s.val = list_odd.get(index);
                s = s.next;
                index++;
            }
            index = 0;
            while (s != null) {
                s.val = list_even.get(index);
                s = s.next;
                index++;
            }
            return head;
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
