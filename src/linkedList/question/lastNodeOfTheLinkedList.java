package linkedList.question;
class last{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node tem=head;
        while (tem.next!=null){
            tem=tem.next;
        }
        tem.next=newNode;
    }
    public void traversal(){
        Node temp=head;
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void fastSlow(){
        Node fast=head;
        Node slow=head;
        while (fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
//        Node tem=head;
//        while (tem.next!=slow){
//            tem=tem.next;
//        }
//        tem.next=slow.next;
//        System.out.println("After deletion the middle node");
//        traversal();
        System.out.println("The first node of the linked List is ->"+head.data);
        System.out.println("The last node of the linked List is ->"+fast.data);
    }
}
public class lastNodeOfTheLinkedList {
    public static void main(String[] args) {
        last l=new last();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(6);
        l.insert(7);
        System.out.println("Actual LinkedList");
        l.traversal();
        l.fastSlow();
    }
}
