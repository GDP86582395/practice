public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode pointer_1 = head;
        ListNode pointer_2 = head.next;
        pointer_1.next = pointer_2.next;
        pointer_2.next = pointer_1;
        head = pointer_2;
        pointer_1.next = swapPairs(pointer_1.next);
        return head;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        SwapPairs swapPairs = new SwapPairs();
        ListNode p = swapPairs.swapPairs(l);
        System.out.println(swapPairs.swapPairs(l));
    }
}
