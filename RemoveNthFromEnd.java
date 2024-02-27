
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        int length = 1;
        ListNode pointer = head;
        while (pointer.next != null){
            pointer = pointer.next;
            length ++;
        }
        if (length == n)
            return head.next;

        pointer = head;
        for (int i = 0; i < length - n - 1; i ++ ){
            pointer = pointer.next;
        }
        pointer.next = pointer.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
        System.out.println(removeNthFromEnd.removeNthFromEnd(l,2 ).val);
        ListNode l2 = new ListNode();
        if (l2.next == null){
            System.out.println(3);
        }


    }

}
