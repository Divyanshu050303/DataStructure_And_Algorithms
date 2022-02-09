package recursion;
class pro
{
    public int product(int n)
    {
        if(n%10==n)
        {
            return n;
        }

        return n%10*product(n/10);
    }
}
public class productOfDigit {
    public static void main(String[] args) {
        pro p=new pro();
        System.out.println(p.product(1234));

    }
}
