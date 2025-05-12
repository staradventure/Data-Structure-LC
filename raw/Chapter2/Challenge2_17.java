package raw.Chapter2;

import java.util.ArrayList;
import java.util.Collections;

public class Challenge2_17 {
    public class Solution {
        public static boolean isPalindrome(ListNode head) {
            ListNode t=head;
            ArrayList<Integer> list=new ArrayList<>();
            ArrayList<Integer> list2=new ArrayList<>();
            while(t!=null){
                list.add(t.val);
                list2.add(t.val);
                t=t.next;
            }
            Collections.reverse(list);
            for(int i=0;i<list.size();i++){
                if(list.get(i)==list2.get(i)){
                    continue;
                }
                else return false;
            }
            return true;
        }

        public static class ListNode {
            int val;
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
