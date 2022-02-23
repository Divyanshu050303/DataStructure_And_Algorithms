package linkedList.question;
//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
public class DeleteTheMiddleNodeOfALinkedList {
    // this is the actual solution
    public ListNode deleteMiddle(ListNode head) {

        if(head.next==null)
        {
            head=null;
        }
        else{
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode temp=head;

            while(temp.next!=slow)
            {
                temp=temp.next;

            }
            temp.next=slow.next;
        }
        return head;


    }
}
