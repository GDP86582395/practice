
public class test {
    public static void main(String[] args) {
        ListNode l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode b = l;
        System.out.println(l.val);
        System.out.println(b.val);
        l.val = 2;
        System.out.println(l.val);
        System.out.println(b.val);
    }
}
