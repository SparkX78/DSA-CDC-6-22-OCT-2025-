public class DSA_39{
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            
        }
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }


    }
    static class LinkedList{
        Node l1;
        Node l2;
        public static Node sum2Linked(Node l1, Node l2){
            Node head = null;
            Node current = null;
            int carry = 0;
            while(l1 != null || l2 != null || carry != 0){
                int sum = carry;
                if(l1 != null){
                    sum += l1.data;
                    l1 = l1.next;
                }
                if(l2 != null){
                    sum += l2.data;
                    l2 = l2.next;
                }
                int digit = sum % 10;
                carry = sum / 10;

                Node newNode = new Node(digit);
                if(head == null){
                    head = newNode;
                    current = newNode;
                } 
                else{
                    current.next = newNode;
                    current = current.next;
                }

            }
            return head;
        }
        public static void printList(Node head){
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
        list.l1 = new Node(3, new Node(4, new Node(2, new Node(7))));
        list.l2 = new Node(3, new Node(7, new Node(1, new Node(6))));
        
        System.out.println("THE SUM OF 2 LINKED LIST");
        Node result = list.sum2Linked(list.l1, list.l2);
        list.printList(result);

        
    }
}