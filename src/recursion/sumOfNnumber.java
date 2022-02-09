package recursion;
class number
{
    public int sum(int n)
    {
        if(n==0)
        {
            return n;
        }
        return n+sum(n-1);
    }
}
public class sumOfNnumber {
    public static void main(String[] args) {
        number n=new number();
        System.out.println(n.sum(5));
    }
}
