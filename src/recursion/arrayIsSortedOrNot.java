package recursion;
class sort
{
    public boolean array(int []arr, int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && array(arr, index+1);
    }
}
public class arrayIsSortedOrNot {
    public static void main(String[] args) {
        sort s=new sort();
        int []a={1,2, 3,4, 5, 6,7 ,8};
        System.out.println("the array is sorted "+s.array(a, 0));
    }
}
