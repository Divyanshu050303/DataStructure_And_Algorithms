package linkedList.question;

import java.util.jar.JarOutputStream;

class odd {
class Node {
    Node next;
    int data;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
Node head;
public void insert(int d){
    Node newNode=new Node(d);
    if(head==null){
        head=newNode;
        return;
    }
    Node tem=head;
    while (tem.next!=null){
        tem=tem.next;
    }
    tem.next=newNode;
    tem=newNode;
    }
 public void traversal(){
    Node temp=head;
    while (temp!=null){
        System.out.print(temp.data+"-> ");
        temp=temp.next;
    }
     System.out.println("null");
 }
 public void evenODD(){

    Node odd=head;
    Node even=head.next;
    Node newNode=even;
     while ( even!=null && odd.next!=null){
        odd.next=even.next;
        odd=odd.next;
        even.next=odd.next;
        even=even.next;
     }
     odd.next=newNode;

 }
}
public class oddEvenLinkedList {
    public static void main(String[] args) {
        odd d=new odd();
        d.insert(1);
        d.insert(2);
        d.insert(3);
        d.insert(4);
        d.insert(5);
        d.insert(6);
        System.out.println("Actual linked list");
        d.traversal();
        System.out.println("After the performed the operation");
        d.evenODD();
        d.traversal();
    }
}
