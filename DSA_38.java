// Definition for singly-linked list
public class DSA_38{
static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

static class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode current = null;

        // Initialize head
        if (list1 != null && (list2 == null || list1.val <= list2.val)) {
            head = list1;
            list1 = list1.next;
        } else if (list2 != null) {
            head = list2;
            list2 = list2.next;
        }

        current = head;

        // Merge remaining nodes
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach leftovers
        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return head;
    }

    // Utility to print the list
    public void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " → ");
            node = node.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        Solution sol = new Solution();

        // First sorted list: 1 → 3 → 5
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));

        // Second sorted list: 2 → 4 → 6
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        // Merge and print
        ListNode merged = sol.mergeTwoLists(list1, list2);
        System.out.println("Merged List:");
        sol.printList(merged);
    }
}
}


