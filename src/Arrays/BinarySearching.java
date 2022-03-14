package Arrays;
import org.w3c.dom.css.CSSImportRule;

import java.util.Scanner;
class searching
{
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
}
public class BinarySearching {
    public static void main(String[] args) {
        Scanner scc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int size= scc.nextInt();
        System.out.println("Enter the array element");
        int []arr=new int[size];
        for (int i=0;i< size;i++)
        {
            arr[i]= scc.nextInt();
        }
        searching s=new searching();
        System.out.println(s.binary(arr, 2));

    }
}
