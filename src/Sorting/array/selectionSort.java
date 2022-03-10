package Sorting.array;
import java.util.Scanner;
class selection{
    int []array;
    int size;
    selection(int size)
    {
        this.size=size;
    }
    public void insert(){
        array=new int[size];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element in the array");
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
        display(array);

    }
    public void display(int []arr)
    {
        for (int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public void sort()
    {
        for (int i = 0; i <size ; i++) {
            int min=i;
            for (int j = i+1; j <size ; j++) {
                if(array[j]<array[min]){
                    min=j;
                }
            }
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;

        }
        display(array);
    }

}
public class selectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        selection ss=new selection(size);
        ss.insert();
        ss.sort();
    }
}
