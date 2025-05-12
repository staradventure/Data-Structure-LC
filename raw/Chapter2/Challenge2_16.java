package raw.Chapter2;

import java.util.ArrayList;

public class Challenge2_16 {
    public class Solution {

        public static ListNode middleNode(ListNode head) {
            ArrayList<Integer> list =new ArrayList<>();
            ListNode t=head;
            while(t!=null){
                list.add(t.val);
                t=t.next;
            }
            int size= list.size();
            int location=size/2+1-1;
            ListNode s=head;
            for(int i=0;i<location;i++){
                s=s.next;
            }
            return s;
        }

        public class ListNode {
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
