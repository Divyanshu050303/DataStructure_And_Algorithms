package Queue_;

import java.util.Scanner;

class priorityQue
{
    Node head;
    class Node
    {
        int value;
        int priority;
        Node next;

        public Node(int value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }
    public void enQueue(int data, int priority)
    {
        Node newNode=new Node(data, priority);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        Node prev=null;
        while (temp!=null && temp.priority>priority)
        {
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)
        {
            prev.next=newNode;
        }
        else {
            if(prev==null) {
                newNode.next=head;
                head=newNode;
            }else{
            newNode.next=head;
            prev.next=newNode;
        }


    }}
    public int deQueue()
    {
        if(head!=null) {
            int data = head.value;
            head = head.next;
            return data;
        }
        return -1;
    }
    public void traverse()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }


}
public class priorityQueueImplementationUsinglinkedList {
    public static void main(String[] args) {
        priorityQue p=new priorityQue();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 for insert" + "\n Press 2 for delete" + "\n Press 3 for traverse" + "\n Press 4 for exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data");
                    int data = sc.nextInt();
                    System.out.println("Enter the priority");
                    int priority= sc.nextInt();
                    p.enQueue(data, priority);
                    break;
                case 2:
                    p.deQueue();
                    break;
                case 3:
                    p.traverse();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice !");
            }
        }
    }
}
