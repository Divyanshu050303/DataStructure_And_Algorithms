package recursion;
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
        int arr[]={1, 2,3 ,4 ,5,7 ,8,88};
        System.out.println(b.search(arr, 4, 0, arr.length-1));
    }
}
