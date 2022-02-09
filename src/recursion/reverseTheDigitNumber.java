package recursion;
class reverse
{
    public void print(int n)
    {
        if(n%10==n/10)
        {
            return;
        }
        System.out.print(n%10);
        print(n/10);
    }
}
public class reverseTheDigitNumber {
    public static void main(String[] args) {
        reverse r=new reverse();
        r.print(12345);
    }
}
