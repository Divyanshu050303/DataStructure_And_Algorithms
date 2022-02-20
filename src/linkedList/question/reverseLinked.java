package linkedList.question;
//https://leetcode.com/problems/reverse-linked-list/
class link
{
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return head;
        }
        ListNode prev=null;
        ListNode present=head;
        ListNode next=present.next;
        while(present!=null)
        {
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null)
            {
                next=next.next;
            }
        }
        return prev;

    }

}
public class reverseLinked {
}
