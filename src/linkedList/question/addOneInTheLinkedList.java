package linkedList.question;

public class addOneInTheLinkedList {
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void reverseList(Node head) {
        if(head==null)
        {
            return;
        }
        Node prev=null;
        Node present=head;
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
        }
        traversal(prev);

    }
    public void addOne(Node pre){
         Node res=pre;
         Node temp=null;
//         Node prev=null;
         int carry=1;
         int sum;
         while (pre!=null){
             sum=carry+pre.data;
             carry=(sum>=10)?1:0;
             sum=sum%10;
             pre.data=sum;
             temp=pre;
             pre=pre.next;
         }
         if(carry>0){
             temp.next=new Node(carry);
         }
        reverseList(res);

    }
    Node head;
    public void insertTheLinkedList(int data){
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
        temp=newNode;
    }
    public void traversal(Node tt){
        Node temp=tt;
        while (temp!=null){
            System.out.print(temp.data+"-> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        addOneInTheLinkedList add=new addOneInTheLinkedList();
        add.insertTheLinkedList(1);
        add.insertTheLinkedList(9);
        add.insertTheLinkedList(9);
        add.insertTheLinkedList(3);
        add.insertTheLinkedList(9);
        System.out.println("Actual linked List");
        add.traversal(add.head);
        System.out.println("Reverse the linked list");
        add.reverseList(add.head);
        System.out.println("After add 1 in the LinkedList");
        add.addOne(add.head);
    }
}
