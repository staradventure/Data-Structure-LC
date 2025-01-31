package raw;

import java.util.ArrayList;
import java.util.Random;

public class Challenge2_8 {
    public static class Solution {
        public static ArrayList <Integer> list;
        public Solution(ListNode head) {
            list=new ArrayList<>();
            ListNode p=head;
            while (p!=null){
                list.add(p.val);
                p=p.next;
            }
        }

        public static int getRandom() {
            if(list.size()==1){
                return list.get(0);
            }
            else {
                java.util.Random random = new Random();
                int index = random.nextInt(list.size());
                return list.get(index);
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
