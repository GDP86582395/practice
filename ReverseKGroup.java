import java.util.Stack;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        if (k == 0 || k == 1)
            return head;
        Stack<ListNode> stack = new Stack<>();
        ListNode pointer = head;
        for (int i = 0; i < k - 1; i ++){
            stack.push(pointer);
            if (pointer.next == null)
                return head;
            pointer = pointer.next;
        }
        ListNode p = reverseKGroup(pointer.next, k);
        head = pointer;
        for (int i = 0; i < k - 1; i ++){
            pointer.next = stack.pop();
            pointer = pointer.next;
        }
        pointer.next = p;

        return head;
    }
    public ListNode reverseList1(ListNode head) {
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
    public ListNode reverseKGroup1(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        if (k == 0 || k == 1)
            return head;
        ListNode pointer = head;
        ListNode end;
        for (int i = 0; i < k - 1; i ++){
            if (pointer.next == null)
                return head;
            pointer = pointer.next;
        }
        end = pointer.next;
        pointer.next = null;

        pointer = reverseList1(head);
        head.next = reverseKGroup1(end, k);

        return pointer;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseKGroup reverseKGroup = new ReverseKGroup();
        ListNode p = reverseKGroup.reverseKGroup1(l, 2);
        System.out.println();
    }
}
