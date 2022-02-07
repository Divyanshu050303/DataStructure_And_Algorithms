package linkedList;
import java.util.Scanner;
class doubly
{
    private Node head;
    private int size;
    doubly()
    {
    this.size=0;
    }
    // Node class
    private class Node
    {
        int value;
        Node previous, next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node previous, Node next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }
    // search the value
    public Node find(int value)
    {
        Node node=head;
        while (node!=null)
        {
            if(node.value==value)
            {
                return node;
            }
            node=node.next;
        }
        return null;
    }
    // search the value by the index
    public Node get(int index)
    {
        Node node=head;
        for (int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node;
    }
    // insert the value at the first
    public void insertFirst(int value)
    {
        Node node =new Node(value);
        node.next=head;
        node.previous=null;
        if(head!=null)
        {
            head.previous=node;
        }
        head=node;
        size++;
    }
    // insert the value at the last
    public void insertLast(int value)
    {
        Node node =new Node(value);
        Node last=head;
        node.next=null;
        if(head==null)
        {
            node.previous=null;
            head=node;
            return;
        }
        while (last.next!=null)
        {
            last=last.next;
        }
        last.next=node;
        node.previous=last;
        size++;
    }
    // insert the value at a particular index
    public void insert(int after, int value)
    {
        Node pr=find(after);
        if (pr==null)
        {
            System.out.println("List is empty ");
            return;
        }
        Node node =new Node(value);
        node.next=pr.next;
        pr.next=node;
        node.previous=pr;
        if(node.next!=null)
        {
            node.next.previous=node;
        }
        size++;
    }
    // delete the first value from the list
    public void  deleteFirst()
    {
        int val=head.value;
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }

            head=head.next;
            head.previous=null;
            System.out.println(val);

        System.out.println(val);
        size--;
    }
    // delete the last value from the list
    public void deleteLast()
    {

        Node temp=head;
        if(temp==null)
        {
            System.out.println("List is empty");
            return;
        }
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        int val=temp.value;
        temp=temp.previous;
        temp.next=null;
        System.out.println(val);
        size--;
    }
    // delete the value at a particular index
    public void delete(int index)
    {
         if(index==0)
         {
             deleteFirst();
             return;
         }
         if(index==size-1)
         {
             deleteLast();
             return;
         }
         Node tepm=get(index-1);
         int val=tepm.next.value;
         tepm.next=tepm.next.next;
         tepm.next=null;
        System.out.println(val);
        size--;


    }
    // display the index
    public void display()
    {
        Node node=head;
        Node last=null;
        System.out.println("This list is in forward order");
        while (node!=null)
        {
            System.out.print(node.value+" ");
            last=node;
            node=node.next;
        }
        System.out.println();
        System.out.println("The list is in reverse order");
        while (last!=null)
        {
            System.out.print(last.value+" ");
            last=last.previous;
        }
    }
}
public class doublyLinkedList {
    public static void main(String[] args) {
        doubly dll = new doubly();
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        while (t) {
            System.out.println("Press 1 -> Insert the value at the first index.");
            System.out.println("Press 2 -> Insert the value at the Last index.");
            System.out.println("Press 3 -> Insert the value at the particular index.");
            System.out.println("Press 4 -> Delete the value at the first index.");
            System.out.println("Press 5 -> Delete the value at the last index.");
            System.out.println("Press 6 -> Delete the value at the particular index.");
            System.out.println("Press 7 -> Find the value by the index.");
            System.out.println("Press 8 ->  Find value by the value");
            System.out.println("Press 9 -> To display the list");
            System.out.println("Press 10 -> to insert the element ");
            System.out.println("Press 11-> to Exit");
            System.out.println("+++++ Enter you choice +++++");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 : {
                    System.out.println("Enter the value which you want to insert");
                    int value = sc.nextInt();
                    dll.insertFirst(value);
                    break;
                }
                case 2 : {
                    System.out.println("Enter the value which you want to insert");
                    int value = sc.nextInt();
                    dll.insertLast(value);
                    break;
                }
                case 3 : {
                    System.out.println("Enter the index where you want to insert");
                    int index = sc.nextInt();
                    System.out.println("Enter the value which you want to insert");
                    int value = sc.nextInt();
                    dll.insert(value, index);
                    break;
                }
                case 4 : {
                    dll.deleteFirst();
                    break;
                }

                case 5 : {
                    dll.deleteLast();
                    break;
                }

                case 6 : {
                    System.out.println("Enter the index where you want to insert");
                    int index = sc.nextInt();

                    dll.delete(index);
                    break;
                }
                case 7 : {
                    System.out.println("Enter the index which you want to find the value");
                    int index = sc.nextInt();
                    System.out.println(dll.get(index));
                    break;
                }
                case 8 : {
                    System.out.println("Enter the value which you want to find ");
                    int value = sc.nextInt();
                    System.out.println(dll.find(value));
                    break;
                }
                case 9 : {
                    dll.display();
                    break;
                }
                case 10 : {
                    System.out.println("Enter the value");
                    int value = sc.nextInt();
                    dll.insertLast(value);
                    break;
                }
                case 11 :
                {
                    t = false;
                    break;

                }
                default:
                {
                    System.out.println("Wrong choice ...");
                }
            }


        }
    }
}
