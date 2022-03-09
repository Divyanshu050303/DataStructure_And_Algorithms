package recursion;
class fibo
{
    public int fiboo(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fiboo(n-1)+fiboo(n-2);
    }
}
public class fibonacci {
    public static void main(String[] args) {
        fibo f=new fibo();
        System.out.println(f.fiboo(5));
    }
}
