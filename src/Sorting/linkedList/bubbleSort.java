package Sorting.linkedList;
import java.util.Scanner;
class bubble{
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
        public void BubbleSortT(){
        Node current =head ;
        Node index=null;
        while (current!=null){
            index=current.next;
            while (index!=null){
                if(current.data>index.data){
                    int temp=current.data;
                    current.data= index.data;
                    index.data= temp;
                }
                index=index.next;
            }
            current=current.next;
        }
        }

}
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bubble b=new bubble();
        System.out.println("Enter the element in the linked list");
        for(int i=0;i<5;i++){
            b.insert(sc.nextInt());
        }
        System.out.println("Before sorting");
        b.traversal();
        b.BubbleSortT();
        System.out.println("After sorting");
        b.traversal();

    }
}
