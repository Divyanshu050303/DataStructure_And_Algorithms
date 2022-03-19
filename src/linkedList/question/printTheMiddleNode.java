package linkedList.question;

import java.util.Scanner;

class middle{
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
        public void traversal(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public void FindTheMiddleNode(){
            Node fast=head;
            Node slow=head;
            while (fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            System.out.println(slow.data);
        }



}
public class printTheMiddleNode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("insert the element in the linked list");
        middle m=new middle();
        for (int i=1;i<=5;i++) {
            m.insert(i);
        }
        m.traversal();
        m.FindTheMiddleNode();
    }
}
