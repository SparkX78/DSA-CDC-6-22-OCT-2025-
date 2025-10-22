public class DSA_36 {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList{
        static Node head;
        public static Node reverseList(Node head){
            Node curr = head;
            Node prev = null;
            while(curr != null){
                Node nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            return prev;

        }
        public static void printList(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.head = new Node(12);
        list.head.next = new Node(15);
        list.head.next.next = new Node(17);
        list.head.next.next.next = new Node(19);
        list.head.next.next.next.next = new Node(21);
        list.head.next.next.next.next.next = new Node(23);
        list.head.next.next.next.next.next.next = new Node(23);

        System.out.println("BEFORE REVERSING THE LINKED LIST");
        list.printList();

        System.out.println("AFTER REVERSING THE LINKED LIST");
        list.head = list.reverseList(list.head);
        list.printList();

        
        
    }
}
