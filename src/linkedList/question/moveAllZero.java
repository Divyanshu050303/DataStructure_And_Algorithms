package linkedList.question;
class Zero{
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void traversal(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void ZeroAside(){

        Node temp=head;
        while(temp!=null ){

            if(temp.next.data==0){
                Node newNode=new Node(0);
                newNode.next=head;
                head=newNode;
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
    }
}
public class moveAllZero {
    public static void main(String[] args) {
        Zero z=new Zero();
        z.insert(4);
        z.insert(4);
        z.insert(0);
        z.insert(5);
        z.insert(0);
        z.traversal(z.head);
        z.ZeroAside();
        z.traversal(z.head);


    }
}
