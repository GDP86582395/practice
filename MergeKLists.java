import java.util.List;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if (k == 0)
            return new ListNode();
        else if(k == 1)
            return lists[0];
        ListNode result = new ListNode();
        ListNode pointer = result;
        while (true){
            ListNode target = result.next;
            int num = 0;
            int i = 0;
            for (;i < k; i++) {
                if (lists[i] != null) {
                    target = lists[i];
                    num = i;
                    break;
                }
            }
            if (i == k)
                break;
            for (; i < k ; i++){
                if (lists[i] != null){
                    if (target.val > lists[i].val) {
                        target = lists[i];
                        num = i;
                    }
                }
            }
            pointer.next = target;
            pointer = pointer.next;
            lists[num] = lists[num].next;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode[] lists = new ListNode[5];
        lists[0] = l;
        MergeKLists mergeKLists = new MergeKLists();
        System.out.println(mergeKLists.mergeKLists(lists).val);
    }
}
