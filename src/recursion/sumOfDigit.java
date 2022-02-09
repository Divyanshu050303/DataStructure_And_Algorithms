package recursion;
class digit
{
    public int sum(int n)
    {
        if(n==0)
        {
            return n;
        }

        return n%10+sum(n/10);
    }
}
public class sumOfDigit {
    public static void main(String[] args) {
        digit d=new digit();
        System.out.println(d.sum(1234));
    }
}
