package Arrays;
import java.util.Scanner;
class insertion
{
    int []arr;
    int size;
    public void getArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter the element in the array");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
    }
    public void InsertionSort()
    {
        int i,j;
        for(i=1;i<size;i++)
        {
            int temp=arr[i];
            j=i;
            while (j>0 && arr[j-1]>=temp)
            {
                arr[j]=arr[j-1];
                j-=1;
            }
            arr[j]=temp;
        }
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

public class insertionSort {
    public static void main(String[] args) {
        insertion in=new insertion();
        in.getArray();
        in.InsertionSort();
    }
}
