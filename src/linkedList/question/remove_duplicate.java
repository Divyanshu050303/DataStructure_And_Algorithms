package linkedList.question;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
class duplicate{
    private ListNode head;
    public static class ListNode{
        private static int val;
        ListNode next;

    }
    // this is the actual solution just copy , paste if you want
    public ListNode deleteDuplicates(ListNode node)
    {
        ListNode head=node;
        if(node==null){
            return node;
        }

        while (node.next != null)
        {
            if (node.val == node.next.val)
            {
                node.next = node.next.next;

            }
            else
            {
                node = node.next;
            }
        }


        return head;
    }
}

public class remove_duplicate {
    public static void main(String[] args) {
     duplicate d=new duplicate();

    }
}
