import java.util.List;

public class RemoveNthNodeFrontEndList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy = new ListNode(0, head);
       ListNode left = dummy;
       ListNode right = head;

       while (n > 0) {
           right = right.next;
           --n;
       }

       while (right != null) {
           left = left.next;
           right = right.next;
       }

       left.next = left.next.next;

       return dummy.next;
    }

    public static void main (String[] args) {

    }
}