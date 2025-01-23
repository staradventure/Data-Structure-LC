package raw;

public class Challenge2_7 {
    public static class MyLinkedList {
        LinkNode head;
        int length;
        public MyLinkedList() {
            head=new LinkNode();
            head.next=null;
            length=0;
        }

        public int getLength(){
            return this.length;
        }

        public int get(int index) {
            if(index>length-1||index<0){
                return -1;
            }
            int count=0;
            LinkNode p=head.next;
            while(count!=index){
                p=p.next;
                count++;
            }
            return p.val;
        }

        public void addAtHead(int val) {
            LinkNode s=new LinkNode(val);
            s.next=head.next;
            head.next=s;
            length++;
        }

        public void addAtTail(int val) {
            LinkNode s=new LinkNode(val);
            LinkNode p=head;
            while(p.next!=null){
                p=p.next;
            }
            p.next=s;
            length++;
        }

        public void addAtIndex(int index, int val) {
            if(index>length||index<0){
                return;
            }
            LinkNode p=new LinkNode(val);
            int count=0;
            LinkNode s=head;
            while(count!=index){
                s=s.next;
                count++;
            }
            p.next=s.next;
            s.next=p;
            length++;
        }

        public void deleteAtIndex(int index) {
            if(index>length-1||index<0){
                return;
            }
            int count=0;
            LinkNode m=head;//m指向要删除节点的前一个节点
            LinkNode s=head.next;//s指向要删除的节点
            while(count!=index){
                s=s.next;
                m=m.next;
                count++;
            }
            m.next=s.next;
            length--;
        }
        class LinkNode{
            int val;
            LinkNode next;
            public LinkNode(){
                next=null;
            }
            public LinkNode(int d){
                val=d;
                next=null;
            }
        }
    }
}
