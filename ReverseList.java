public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next  == null)
            return head;
        ListNode start = null;
        ListNode end = head.next;
        ListNode pointer = head;
        while (end != null){
            pointer.next = start;
            start = pointer;
            pointer = end;
            end = end.next;
        }
        pointer.next = start;
        return pointer;

    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseList reverseList = new ReverseList();
        ListNode p = reverseList.reverseList(l);
        System.out.println();
    }
}
