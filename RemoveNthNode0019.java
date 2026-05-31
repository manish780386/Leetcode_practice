import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveNthNode0019 {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Fast ko n+1 steps aage le jao
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Dono pointers move karo
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Node remove karo
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }

    public static ListNode createList(Scanner sc, int size) {

        if (size == 0) return null;

        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;

        for (int i = 1; i < size; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int size = sc.nextInt();

        System.out.println("Enter linked list elements:");

        ListNode head = createList(sc, size);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        head = removeNthFromEnd(head, n);

        System.out.println("Updated Linked List:");

        printList(head);

        sc.close();
    }
}