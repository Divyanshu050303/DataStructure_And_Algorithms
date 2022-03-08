package Arrays;
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
        int []arr={1, 2,4, 5,3 ,5, 7, 8,7};
        searching s=new searching();
        System.out.println(s.binary(arr, 2));
    }
}
