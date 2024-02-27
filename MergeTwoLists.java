public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode();
        ListNode pointer = listNode;
        if (list1 == null)
            pointer.next = list2;
        if (list2 == null)
            pointer.next = list1;

        while (list1 != null && list2 != null){
            if (list1.val > list2.val){
                pointer.next = list2;
                if (list2.next == null){
                    list2.next = list1;
                    break;
                }
                list2 = list2.next;
            }else {
                pointer.next = list1;
                if (list1.next == null){
                    list1.next = list2;
                    break;
                }
                list1 = list1.next;
            }
            pointer = pointer.next;
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        System.out.println(mergeTwoLists.mergeTwoLists(l, l).val);

    }
}
