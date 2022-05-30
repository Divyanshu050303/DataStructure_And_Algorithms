package linkedList.question;
class ListNode
{
    int val;
    ListNode next;
}
class remove
{
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        while(temp!=null)
        {
            if(head.val==val)
            {
                head=head.next;

            }
            else if(temp.next.val==val)
            {
                temp.next=temp.next.next;
            }
            else
            {
                return head;
            }
            temp=temp.next;
        }
        return head;

    }
}
public class removeTheLinkedListElement {
}
