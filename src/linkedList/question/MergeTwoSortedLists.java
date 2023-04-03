package linkedList.question;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newLink = new ListNode();
        ListNode time = newLink;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                time.next = list1;
                list1 = list1.next;
            } else {
                time.next = list2;
                list2 = list2.next;
            }
            time = time.next;
        }
        time.next = list1 == null ? list2 : list1;
        return newLink.next;
    }
}
