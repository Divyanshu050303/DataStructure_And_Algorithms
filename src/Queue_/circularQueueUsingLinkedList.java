package Queue_;
import java.util.Scanner;
class circular
{
    Node front, rear;

    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public void enQueue(int data)
    {
        Node temp=new Node(data);
        if(front==null)
        {
            front=rear=temp;
        }
        else {
            rear.next = temp;
            rear = temp;
            System.out.println("Data inserted...");
        }
        rear.next=front;
    }
    public void deQueue()
    {
        Node temp=front;
        if(front==null)
        {
            System.out.println("Queue empty...");
        }
        else if(front==rear)
        {
            System.out.println("Data : "+front.value);
            front=rear=null;
        }
        else {
            System.out.println("Data : "+front.value);
            front=front.next;
            rear.next=front;
        }
    }
    public void traverse()
    {
        Node temp=front;

        if(front==null)
        {
            System.out.println("Queue empty");
         }

        else{
        while (temp.next != front) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
            System.out.print(temp.value+"\n");
    }
    }
}
public class circularQueueUsingLinkedList {
    public static void main(String[] args) {
        circular c=new circular();
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            System.out.println("Press 1 for insert"+"\n Press 2 for delete"+"\n Press 3 for traverse"+"\n Press 4 for exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data");
                    int data=sc.nextInt();
                    c.enQueue(data);
                    break;
                case 2: c.deQueue();
                    break;
                case 3: c.traverse();
                    break;
                case 4: System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice !");
            }
        }
    }
}
