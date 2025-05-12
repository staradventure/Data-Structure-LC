package raw.Chapter2;

public class Challenge2_10 {
    public class Solution {
        public static void deleteNode(ListNode node) {
            ListNode p = node;
            while (p!= null) {
                ListNode s = p.next;
                int temp = p.val;
                p.val = s.val;
                s.val = temp;
                if(p.next.next==null){
                    break;
                }
                p = p.next;
            }
            p.next=null;
        }

        public static class ListNode {
            public int val;
            public ListNode next;

            public ListNode(int x) {
                val = x;
            }
        }
    }
}
