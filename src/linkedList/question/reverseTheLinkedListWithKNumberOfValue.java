package linkedList.question;
class number1
{
    Node head, head1;
    class Node
    {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }
    }
    public void insert(int val)
    {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        reverse(head, 3);
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void reverse(Node head, int k)
    {
        head1=head;
        Node temp=head1;
        int n=0;
        while (temp!=null)
        {
            if(n==k)
            {
                Node prev=null;
                Node present=temp;
                Node next=present.next;
                while(present!=null)
                {
                    present.next=prev;
                    prev=present;
                    present=next;
                    if(next!=null)
                    {
                        next=next.next;
                    }
                    n-=1;
                }
            }
            n+=1;
            temp=temp.next;
        }

    }
    public void reverseKNumber()
    {
        Node temp=head1;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }
}
public class reverseTheLinkedListWithKNumberOfValue {
    public static void main(String[] args) {
        number1 n=new number1();
        for (int i=1;i<11;i++)
        {
            n.insert(i);
        }
        n.display();
        n.reverseKNumber();
    }
}
