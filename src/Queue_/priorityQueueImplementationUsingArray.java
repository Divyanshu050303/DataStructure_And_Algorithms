package Queue_;
import java.util.Scanner;
class priority
{
 int size;
 int []array;
 int maxPriority;
 priority()
 {
     maxPriority=10;
     array=new int[maxPriority];
     size=0;
 }
 public void enQueue(int val)
 {
     if(size==0)
     {
         array[0]=val;
         size++;
         return;
     }
     int i;
     for ( i = size-1; i >=0 ; i--) {
         if(val<array[i])
         {
             array[i+1]=array[i];
         }
         else
         {
             break;
         }
     }
     array[i+1]=val;
     size++;
 }
 public void traverse()
 {
     for (int i = 0; i < size; i++) {
         System.out.print(array[i]+" ");
     }
 }
 public void deQueue()
 {
     System.out.println(array[--size]+" removed");
 }
}
public class priorityQueueImplementationUsingArray {
    public static void main(String[] args) {
        priority p=new priority();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 for insert" + "\n Press 2 for delete" + "\n Press for traverse" + "\n Press 4 for exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the data");
                    int data = sc.nextInt();
                    p.enQueue(data);
                }
                case 2 -> p.deQueue();
                case 3 -> p.traverse();
                case 4 -> System.exit(0);
                default -> System.out.println("Wrong Choice !");
            }
        }
    }
}
