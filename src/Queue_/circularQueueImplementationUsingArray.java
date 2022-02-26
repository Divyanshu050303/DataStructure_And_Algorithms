package Queue_;
import java.util.Scanner;
class circularQueue
{
    int []arr;
    int rear, front;
    int size;
    circularQueue(int size)
    {
        arr=new int[size];
        front =rear=-1;
    }
    public void enqueue(int data)
    {
        if(front==rear && front==-1)
        {
            front=rear=0;
            arr[rear]=data;
        }
        else if((rear+1)==front)
        {
            System.out.println("Queue is full...");
        }
        else
        {
            rear=(rear+1)%size;
            arr[rear]=data;
        }
    }
    public void deQueue()
    {
        if(front==rear && front==-1)
        {
            System.out.println("Queue is empty");
        }
        else if(front==rear)
        {
            System.out.println("Element is :"+arr[front]);
            front=rear-1;
        }
        else
        {
            System.out.println("Element is :"+arr[front]);
            front=(front+1)%size;
        }
    }
    public void traverse()
    {
        if(front == rear && rear == -1) {
            System.out.println("Queue is Empty!!");
        }
        else {
            int i = front;
            System.out.println("Elements are : ");
            while(i<=rear) {
                System.out.print(arr[i] + " ");
                i = (i+1)%size;
            }
        }
    }
}
public class circularQueueImplementationUsingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        circularQueue q = new circularQueue(size);
        while (true) {
            System.out.println("Press 1 for insert" + "\n Press 2 for delete" + "\n Press for traverse" + "\n Press 4 for exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data");
                    int data = sc.nextInt();
                    q.enqueue(data);
                    break;
                case 2:
                    q.deQueue();
                    break;
                case 3:
                    q.traverse();
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
