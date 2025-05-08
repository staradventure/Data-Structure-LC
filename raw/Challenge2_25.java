package raw;

import java.util.ArrayList;
import java.util.List;

public class Challenge2_25 {
    public class Solution {
        public static ListNode mergeKLists(ListNode[] lists) {
            return merge_func(lists,new int [] {0, lists.length-1});
        }

        /**
         *
         * @param lists 包含待合并的链表的头节点数组
         * @param temp_list
         * @return
         */
        public static ListNode merge_func(ListNode[] lists, int[] temp_list){
            ListNode node1=null;
            ListNode node2=null;
            if(temp_list[0]==temp_list[1]){
                return lists[temp_list[0]];
            }
//            if(temp_list[0]+1==temp_list[1]){
//                return mergeTwoLists(lists[temp_list[0]],lists[temp_list[0]]);
//            }
            else {
                int[] new_list = get_it(temp_list[0], temp_list[1]);
                int[] lower={new_list[0],new_list[1]};
                int[] upper={new_list[1],new_list[2]};
                node1=merge_func(lists, lower);//传入begin和middle的值。
                node2=merge_func(lists, upper);//传入begin和middle的值。
                //TODO:合并内容
            }
            return mergeTwoLists(node1,node2);
        }

        /**
         *
         * 输入是起始序号、结束序号，返回起始序号、结束序号和中间序号，构成int数组并返回。
         * @param begin
         * @param end
         * @return 一个int[3]数组，包含begin、middle和end三个数。
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
