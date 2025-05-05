package raw;

import java.util.ArrayList;
import java.util.List;

public class Challenge2_25 {
    public class Solution {
        public static ListNode mergeKLists(ListNode[] lists) {
            int[] number_list=get_it(0, lists.length-1);
            return merge_func(lists,number_list);
        }

        public static ListNode merge_func(ListNode[] lists, int[] temp_list){
            if(temp_list[0]==temp_list[1]){
                return lists[temp_list[0]];
            }
            if(temp_list[0]+1==temp_list[1]){
                return mergeTwoLists(lists[temp_list[0]],lists[temp_list[0]]);
            }
            int[] number_list=get_it(temp_list[0],temp_list[1]);
            merge_func(lists,number_list);
            //TODO:合并内容
        }

        /**
         *
         * 输入是起始编号，给出需要合并的头节点编号
         * @param begin
         * @param end
         * @return 一个ArrayList数组，给出第一个节点的位置，和第二个节点的位置。
         */
        public static int[] get_it(int begin, int end){
            int middle=(int)Math.floor((double) ((begin+end)/2));
            int [] number_array={begin,middle,end};
            return number_array;
        }
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode p=list1;
            ListNode q=list2;
            ListNode c =new ListNode();
            ListNode t=new ListNode();
            c.next=t;
            while(p!=null&&q!=null){
                if(p.val<q.val){
                    t.next=p;
                    t=p;
                    p=p.next;
                }
                else{
                    t.next=q;
                    t=q;
                    q=q.next;
                }
            }
            t.next=null;
            if(p!=null){
                t.next=p;
            }
            if(q!=null){
                t.next=q;
            }
            return c.next.next;
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
