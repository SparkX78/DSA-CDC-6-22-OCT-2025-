public class DSA_35 {
    static class ListNode{
        ListNode next;
        int data;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList{
        static ListNode head;
        public static int Search_Index(int key){
            ListNode temp = head;
            int index = 0;
            while(temp != null){
                if(temp.data == key){
                    return index;
                }
                temp = temp.next;
                index++;

            }
            return -1;

        }
    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.head = new ListNode(21);
        list.head.next = new ListNode(23);
        list.head.next.next = new ListNode(25);
        list.head.next.next.next = new ListNode(27);
        int key = 211;
        System.out.println(list.Search_Index(key));

    }
}
