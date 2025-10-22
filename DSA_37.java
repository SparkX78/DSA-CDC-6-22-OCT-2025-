public class DSA_37 {
    static class ListNode{
        ListNode next;
        int data;
        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList{
        ListNode head;
        public static ListNode middleLinked(ListNode head){
            if(head == null)return null;
            ListNode slow = head;
            ListNode fast = head;
            while(fast!= null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        public static void printList(ListNode head){
            ListNode temp = head;
            while(temp != null){
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public static void main(String args[])
        {
            LinkedList list = new LinkedList();
            list.head = new ListNode(11);
            list.head.next = new ListNode(12);
            list.head.next.next = new ListNode(13);
            list.head.next.next.next = new ListNode(14);
            list.head.next.next.next.next = new ListNode(15);

            System.out.println("ORIGINAL LIST");
            list.printList(list.head);

            list.head = list.middleLinked(list.head);
            System.out.println("MIDDLE LIST");
            list.printList(list.head);
            
        }
    }
}
