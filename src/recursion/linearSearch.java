package recursion;
class search
{
    public boolean linear(int []arr, int value, int index)
    {
        if(index==arr.length-1)
        {
            return false;
        }
        if(arr[index]==value)
        {
            System.out.println("at "+index);
        }
        return arr[index]==value || linear(arr, value, index+1);
    }
}

public class linearSearch {
    public static void main(String[] args) {
        search s=new search();
        int []arr={1, 27, 37, 2,8,3, 5, 6};
        System.out.println("Value in the array "+s.linear(arr, 8, 0));

    }
}
