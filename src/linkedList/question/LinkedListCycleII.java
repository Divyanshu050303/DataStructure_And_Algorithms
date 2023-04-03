package linkedList.question;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
    ListNode slow=head;
    ListNode fast=head;
    ListNode start=null;
        while(fast!=null && fast.next!=null)
    {
        fast=fast.next.next;
        slow=slow.next;
        if(fast==slow)
        {
            start=head;
            while(slow!=start){
                start=start.next;
                slow=slow.next;
            }
            break;

        }
    }
        return start;
}
}
