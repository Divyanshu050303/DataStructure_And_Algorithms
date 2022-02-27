package Queue_;

import java.util.Scanner;
class queue
{
    private int maxSize, front, rear, nItem;
    private final int []queArray;
    queue(int s)
    {
        maxSize=s;
        queArray=new int[maxSize];
        front=0;
        rear=-1;

    }
    public void insert()
    {

        if(rear==maxSize)
        {
            System.out.println("Sorry queue is full");
        }
        else
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the element in the queue");
            int n=sc.nextInt();
            rear=rear+1;
            queArray[rear]=n;
            nItem+=1;
        }
    }
    public void remove()
    {

        if(front==maxSize)
        {
            System.out.println("Sorry Queue is empty");
        }
        else
        {
            System.out.println(queArray[front]);
            front+=1;
            maxSize-=1;
        }
    }
    public void peekFront()
    {
        System.out.println(queArray[front]);
    }
    public void view()
    {
        if(rear==-1)
        {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The whole queue is :");
            for (int i = 0; i <maxSize; i++) {
                System.out.println(queArray[front+i]);
            }
        }
    }



}
public class QueueBasicOperation {
    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the size of the queue");
        queue q=new queue(sc1.nextInt());

        boolean t=true;
        while (t)
        {
            System.out.println("Enter 1 -> View");
            System.out.println("Enter 2 -> Insert");
            System.out.println("Enter 3 -> remove");
            System.out.println("Enter 4 -> Peek");
            System.out.println("Enter 5 -> Exit");

            int choice = sc1.nextInt();
            switch (choice)
            {
                case 1:
                    q.view();
                    break;
                case 2:
                    q.insert();
                    break;
                case 3:
                    q.remove();
                    break;
                case 4:
                    q.peekFront();
                    break;
                case 5:
                    t=false;
                    break;
                default:
                    System.out.println("Wrong choice...");
            }
        }

    }
}
