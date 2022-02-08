package linkedList;

class circular {
    private Node head, tail;
    circular()
    {
        this.head=null;
        this.tail=null;
    }
    public void insert(int value)
    {
        Node node=new Node(value);
        if(head==null)
        {
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void display()
    {
        Node node=head;
        if (head!=null)
        {
            do {
                System.out.print(node.value+" ");
                node=node.next;
            }while (node!=head);
            System.out.println();

        }
    }
    public void delete(int val)
    {
        Node node=head;
        if(head==null)
        {
            return;
        }
        if(node.value==val)
        {
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;
            if(n.value==val)
            {
                node.next=n.next;
                break;
            }
            node=node.next;
        }
        while (node!=head);
    }
    private class Node
    {
        private int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
public class circularLinkedList {
    public static void main(String[] args) {
        circular cll=new circular();
        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.insert(5);
        cll.insert(6);
        cll.display();
        cll.delete(3);
        cll.display();
    }
}
