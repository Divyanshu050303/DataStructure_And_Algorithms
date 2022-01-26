package Arrays;
import java.util.Scanner;
class selection
{
    int []array;
    int size;
    public void getArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
        array=new int[size];
        System.out.println("Enter the element in the array");
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
    }
    public void selectionSort()
    {
        int i, j, min;
        for (i = 0;i<size -1; i++)
        {
        min=i;
            for (j =i+1 ; j <size ; j++) {
                if(array[j]<array[min]) {
                    min = j;
                }
            }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
        }
        for (int k = 0; k < size; k++) {
            System.out.print(array[k]+" ");
        }
    }
}
public class SelectionSort {
    public static void main(String[] args) {
        selection s=new selection();
        s.getArray();
        s.selectionSort();
    }
}
