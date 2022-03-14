package recursion;
import java.util.Scanner;
class binary
{
    public int search(int arr[], int value, int start, int end)
    {
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==value)
        {
            return mid;
        }
        if(value<arr[mid])
        {
            return search(arr, value, start, mid-1);
        }
        return search(arr, value, mid+1, end);

    }
}
public class binarySearch {
    public static void main(String[] args) {
        binary b=new binary();
        System.out.println("Enter the length of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the element in the array");
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(b.search(arr, 4, 0, arr.length-1));
    }
}
