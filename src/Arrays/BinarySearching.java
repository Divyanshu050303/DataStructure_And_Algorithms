package Arrays;
import java.util.Scanner;
class searching
{
    int size;
    int []arr;
    searching(int size){
        this.size=size;
        arr=new int[size];
        insert();
    }
    public int binary(int [] arr, int key)
    {
        int high, low, mid;
        low=0;
        high=arr.length-1;
        while (low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }
    public void display()
    {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public void insert()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element in the array");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the searching element");
        int search=sc.nextInt();
        System.out.println( (binary(arr, search)+1));
    }
}
public class BinarySearching {
    public static void main(String[] args) {
        Scanner scc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int size= scc.nextInt();

        searching s=new searching(size);


    }
}
