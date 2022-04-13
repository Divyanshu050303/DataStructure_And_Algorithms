package Sorting.array;
import java.util.Scanner;
class sort
{
    int []arr;
    int size;
    sort(int size)
    {
        this.size=size;
        arr=new int[size];

    }
    public void insert()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element in the array");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();

        }
    }
    public void display()
    {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public void bubble()
    {
        for (int i = 0; i < size-1; i++){
            for (int j = 0; j < size-i-1; j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
public class bubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        sort s=new sort(size);
        s.insert();
        System.out.println("Before sorting");
        s.display();
        s.bubble();
        System.out.println("After sorting");
        s.display();

    }
}
