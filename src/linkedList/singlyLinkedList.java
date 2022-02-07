package linkedList;
import java.nio.file.ClosedFileSystemException;
import java.util.Scanner;
class linkedList
{
    private Node head, tail; //Here we create the head and tail to point the first and the last element in the linked list
    private int size;//this is used to store the size of linked list
    private static class Node// this is the Node class
    {
        private final int value;
        private Node next;// this is variable to point the next element
        Node(int value)
        {
            this.value= value;
        }
        Node(int value, Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
    linkedList()
    {
        this.size=0;// here we initial the size as 0
    }
    public void insertFirst(int val)// this function is used to insert the value at the first in the linked list
    {
        Node node= new Node(val);// here we made the mode class object
        node.next=head;//this point the next element to the head
        head=node;// this point the newly established node always
        if(tail==null)// here we check if the last element of the linked list equal to null
        {
            tail=head;// then both the tail and head both are equal
        }
        size+=1;// here we increase the size of linked by one
    }
    public void insertLast(int val)// this function is used to insert the value at the last in the linked list
    {
        if(tail==null)// if tail is equal to the tail then
        {
            insertFirst(val);
            return;// this simply return the function action
        }
        Node node= new Node(val);//this is the node class object
        tail.next=node;//here we point the new implement node that is node
        tail=node;// but tail always point the last element, so we made new implement node to the tail
        size++;// increase the size one

    }
    public void insert(int val, int index)// this function is used to insert the value at a particular index
    {
        if(index==0)// if index is equal to the 0 than , we simply class the insertFirst function
        {
            insertFirst(val);
            return;
        }
        if(index==size-1)//if index is equal to the size than , we simply class the insertLast function
        {
            insertLast(val);
            return;
        }
        Node temp=head;// here create a temporary variable because the head always point the first element of the linked list
        for (int i = 0; i <index ; i++) {
            temp=temp.next;// here we change the temporary variable to the indexed just first variable
        }
        Node node = new Node(val, temp.next);
        temp.next=node;// here we insert the indexed element
        size++;

    }
    public int deleteFirst()// this function is used to delete the first element form the linked list
    {
     int val=head.value;// here we fetch the head value
     head=head.next;// here we shift the head to the next value
     if(head==null)//if head ie equal to the null
     {
         tail=null;// then tail is also equal to the null
     }
     size--;
     return val;// return the deleted value
    }
    public Node get(int index)
    {
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    public int deleteLast()// this function is used to delete the last element form the linked list
    {
        if(size<=1)// if the size is one or 0 than , we simply call the deleteFirst that function handled the operation
        {
            return deleteFirst();
        }
        Node secondLast=get(size-2);//here we fetch the  Second last value of the linked list
        int val=tail.value;// // here we fetch the last value of the linked list
        tail=secondLast;// second last  element is now tail
        tail.next=null;// we initialize null all element after the tail
        size--;
        return val;//return the deleted element
    }
    public int delete(int index)// this function is used to delete the element at a particular index form the linked list
    {
        if(index==0)
        {
            return deleteFirst();
        }
        if(index==size-1)
        {
            return deleteLast();
        }
        Node pre=get(index-1);// here we store just first value that we want to delete
        int val=pre.next.value;// here we store that value we actually deleted
        pre.next=pre.next.next;// here we skip the val value and link the per value to the next node
        size--;
        return val;
    }
    public Node find(int value)//this function is used to find the element using the value
    {
        Node node=head;// here we initialize the head value to the node
        while (node!=null)//this loop goes till  last
        {
            if(node.value==value)//if  node value is equal to the search value
            {
                return node;// then return the node
            }
            node=node.next;
        }
        return null;

    }
    public void display()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println("End");
    }
}
public class singlyLinkedList {
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        Scanner sc=new Scanner(System.in);
        boolean t=true;
        while (t)
        {

            System.out.println("Press 1 -> Insert the value at the first index");
            System.out.println("Press 2 -> Insert the value at the Last index");
            System.out.println("Press 3 -> Insert the value at the particular index");
            System.out.println("Press 4 -> Delete the value at the first index");
            System.out.println("Press 5 -> Delete the value at the last index");
            System.out.println("Press 6 -> Delete the value at the particular index");
            System.out.println("Press 7 -> Find the value by the index");
            System.out.println("Press 8 ->  Find value by the value");
            System.out.println("Press 9 -> To display the list");
            System.out.println("Press 10 -> to insert the element ");
            System.out.println("Press 11-> to Exit");
            System.out.println("+++++ Enter you choice +++++");
            int choice= sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the value which you want to insert");
                    int value = sc.nextInt();
                    ll.insertFirst(value);
                    break;
                }
                case 2: {
                    System.out.println("Enter the value which you want to insert");
                    int value = sc.nextInt();
                    ll.insertLast(value);
                    break;
                }

                case 3: {
                    System.out.println("Enter the index where you want to insert");
                    int index = sc.nextInt();
                    System.out.println("Enter the value which you want to insert");
                    int value = sc.nextInt();
                    ll.insert(value, index);
                    break;
                }
                case 4: {
                    System.out.println(ll.deleteFirst());
                    break;
                }

                case 5: {
                    System.out.println(ll.deleteLast());
                    break;
                }

                case 6: {
                    System.out.println("Enter the index where you want to insert");
                    int index = sc.nextInt();

                    System.out.println(ll.delete(index));
                    break;
                }
                case 7: {
                    System.out.println("Enter the index which you want to find the value");
                    int index = sc.nextInt();
                    System.out.println(ll.get(index));
                    break;
                }
                case 8: {
                    System.out.println("Enter the value which you want to find ");
                    int value = sc.nextInt();
                    System.out.println(ll.find(value));
                    break;
                }
                case 9: {
                    ll.display();
                    break;
                }
                case 10: {
                    System.out.println("Enter the value");
                    int value = sc.nextInt();
                    ll.insertLast(value);
                }
                case 11:
                {
                    t=false;

                }
                default:
                {
                    System.out.println("Wrong choice ...");
                }
            }



        }
    }
}
