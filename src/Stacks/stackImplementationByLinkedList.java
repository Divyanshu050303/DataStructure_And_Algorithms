package Stacks;

import java.util.Scanner;

class implement
{
    Node head;
    class Node
    {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    public void push(int data)
    {
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        System.out.println("Data inserted.....");
    }
    public void pop()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            int data=head.value;
            head=head.next;
            System.out.println(data+" is deleted from the list");
        }
    }
    public void traverse()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node temp=head;
            while (temp!=null)
            {
                System.out.print(temp.value+"->");
                temp=temp.next;
            }
            System.out.println("end");
        }
    }
}

public class stackImplementationByLinkedList {
    public static void main(String[] args) {
        implement i=new implement();
        System.out.println("Press 1 -> insert");
        System.out.println("Press 2 -> Delete");
        System.out.println("Press 3 -> traverse");
        System.out.println("Press 4 -> exit");
        while (true)
        {
            System.out.println("Enter the choice");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.println("Enter the data ");
                    int data=sc.nextInt();
                 i.push(data);
                 break;
                }
                case 2:
                {
                    i.pop();
                    break;

                }
                case 3:
                {
                    i.traverse();
                    break;

                }
                case 4:
                {
                    System.exit(0);
                    break;

                }
                default:
                {
                    System.out.println("Wrong choice");
                    break;

                }
            }
        }
    }
}
