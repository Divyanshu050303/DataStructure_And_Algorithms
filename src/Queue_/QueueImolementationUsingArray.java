package Queue_;
import java.util.Scanner;
class que
{
    int []arr;
    int front, rear;
    que(int size)
    {
        arr= new int[size];
        front=-1;
        rear=-1;
    }
    public void insert()
    {
        if(rear==arr.length-1)
        {
            System.out.println("Queue is full");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc=new Scanner(System.in);
            int data=sc.nextInt();
            if(front==-1)
            {
                front=0;
            }
            arr[++rear]=data;
            System.out.println("Data inserted...");
        }
    }
    public void delete()
    {
        if(rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println(arr[front]);
            if(front==rear)
            {
                front=rear=-1;
            }
            else if(front<rear)
            {
                front++;
            }
        }
    }
    public void traverse()
    {
        if(front==-1 || rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            for (int i = front; i <=rear ; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}

public class QueueImolementationUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        que q=new que(size);
        while (true)
        {
            System.out.println("Press 1 for insert"+"\n Press 2 for delete"+"\n Press for traverse"+"\n Press 4 for exit");
            int choice=sc.nextInt();
            switch (choice) {
                case 1: q.insert();
                    break;
                case 2: q.delete();
                    break;
                case 3: q.traverse();
                    break;
                case 4: System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice !");
            }

        }
    }
}
