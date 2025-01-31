package raw;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge2_12 {
    public class Solution {
        public static ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode p = head;
            int count = 1;
            while (p != null && count < left) {
                p = p.next;
                count++;
            }
            //此时p指向left节点
            ListNode s = p;
            int ready = count;
            ArrayList<Integer> list = new ArrayList<>();
            while (ready < right) {
                list.add(s.val);
                s = s.next;
                ready++;
            }
            list.add(s.val);
            if (s.next== null);
            else{
                s=s.next;
            }
            Collections.reverse(list);
            ListNode t = p;
            int index_max = ready - count;//TODO:这里的边界关系可能会出错。
            int index = 0;
            while (t != s.next && t != null && index <= index_max) {
                t.val = list.get(index);
                index++;
                t = t.next;
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
