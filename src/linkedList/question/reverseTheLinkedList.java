package linkedList.question;
class reverse
{
    Node head, tail;
    class Node
    {
        int value;
        Node next;
    }
    public void list(Node node)
    {
        if(node==tail)
        {
            head=tail;
            return;
        }
        list(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
    }
}
public class reverseTheLinkedList {
    reverse r=new reverse();
}
