package Queue_;
import java.util.Scanner;
class queueImp {
    Node front, rear;

    class Node {
        int value;

        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void enQueue(int data) {
        Node temp = new Node(data);
        if (rear == null) {
            front = rear = temp;
            return;
        }
        rear.next = temp;
        rear = temp;
        System.out.println("Data inserted...");
    }

    public void deQueue()
    {
        if(front==null)
        {
            return;
        }
        Node temp=front;
        front=front.next;
        System.out.println(temp.value+" deleted...");
        if(front==null)
        {
            rear=null;
        }
    }
    public void traverse()
    {
        Node temp=front;
        while (temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class QueueImplementationUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        queueImp qi=new queueImp();
        while (true)
        {

            System.out.println("Press 1 for insert"+"\n Press 2 for delete"+"\n Press for traverse"+"\n Press 4 for exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data");
                    int data=sc.nextInt();
                    qi.enQueue(data);

                    break;
                case 2: qi.deQueue();
                    break;
                case 3: qi.traverse();
                    break;
                case 4: System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice !");
            }

        }
    }
}
