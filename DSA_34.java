public class DSA_34 {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    static class LinkedList{
        static Node head;
        public static void deleteNode(int key){
            Node temp = head;
            Node prev = null;
            if(temp != null && temp.data == key){
                head = temp.next;
                return;

            }
            while(temp != null && temp.data != key){
                prev = temp;
                temp = temp.next;
            }
            if(temp == null) return ;
            prev.next = temp.next;

        }
        public static void printLinkedList(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data +"-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
        
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);

        System.out.println("Before deletion:");
        list.printLinkedList();

        list.deleteNode(2);

        System.out.println("After deletion:");
        list.printLinkedList();
    }
}

        
    

    
