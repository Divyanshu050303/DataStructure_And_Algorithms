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
        for (int out = arr.length-1; out >1 ; out--) {
            for (int in = 0; in < out; in++) {
                if(arr[in]>arr[in+1])
                {
                    int temp=arr[in];
                    arr[in]=arr[in+1];
                    arr[in+1]=temp;
                }
            }
        }
    }
}
public class bubbleSort {
    public static void main(String[] args) {
        sort s=new sort(5);
        s.insert();
        System.out.println("Before sorting");
        s.display();
        s.bubble();
        System.out.println("After sorting");
        s.display();

    }
}