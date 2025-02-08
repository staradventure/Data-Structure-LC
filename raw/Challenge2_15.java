package raw;

public class Challenge2_15 {

    public static class Solution {

        public static ListNode swapPairs(ListNode head) {
            if (head == null) {//节点数为0
                return null;
            }
            if (head.next == null) {//节点数为1
                return head;
            }
            int count = 0;
            ListNode c = head;
            while (c != null) {
                count++;
                c = c.next;
            }
            int times = 0;
            ListNode p;//p指向头节点
            ListNode p1;//p1交换的第一个节点
            ListNode p2;//p2交换的第二个节点
            ListNode p3 = null;//p3的作用是节点数大于2的情况时，用next指向下一对的第一个节点
            ListNode p4 = null;//p4的作用是在p1和p2交换的时候，直接指向下一对的第一个节点
            if (count >= 2) {
                //先把最前面的一对处理完了。
                p1 = head;
                p2 = p1.next;
                p4 = p2.next;
                p = p2;
                p2.next = p1;
                times++;
                if (count == 2) {//只有2个的情况，那就该进行结尾工作了
                    p1.next = null;
                    return p;
                } else {
                    if(times==count/2){
                        p1.next=p4;
                        return p;
                    }
                    p3 = p1;
                    while (true) {
                        //多于2个的，先照抄。
                        p1 = p4;
                        p2 = p4.next;
                        p4 = p2.next;
                        p3.next = p2;
                        p2.next = p1;
                        times++;
                        //在开始下一轮之前，先检查后面还有没有节点
                        if (p4 == null) {//如果没有节点了
                            p1.next = null;
                            break;
                        } else if (times == count / 2) {
                            p1.next=p4;
                            return p;
                        } else {
                            p3 = p1;
                        }
                    }
                }
                return p;
            }
            return null;
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


