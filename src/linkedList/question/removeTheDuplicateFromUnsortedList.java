package linkedList.question;

import com.sun.security.auth.UnixNumericGroupPrincipal;

import javax.crypto.spec.PSource;

class dup{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void insert(int val){
        Node newNode=new Node(val);

        if(head==null){
            head=newNode;
            return;
        }
        Node temp1=head;
        while (temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=newNode;
    }
    public void print(){
        Node temp=head;
        while (temp!= null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public void remove(){
        Node temp1=head;
        Node temp2=null;
        while (temp1 != null &&temp1.next!=null){
            temp2=temp1;
            while (temp2.next!=null){
                if(temp1.data==temp2.next.data){
                    temp2.next=temp2.next.next;
                }
                else{
                    temp2=temp2.next;
                }
            }
            temp1=temp1.next;
        }
    }
}
public class removeTheDuplicateFromUnsortedList {
    public static void main(String[] args) {
        dup d=new dup();
        d.insert(1);
        d.insert(2);
        d.insert(3);
        d.insert(2);
        d.insert(4);
        d.insert(5);
        d.print();
        d.remove();
        System.out.println();
        d.print();
    }
}
