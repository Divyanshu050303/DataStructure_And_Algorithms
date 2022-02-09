package recursion;
class fact
{
    public int facto(int n)
    {
        if(n==1)
        {
            return n;
        }
        return n*facto(n-1);
    }
}
public class factorial {
    public static void main(String[] args) {
        fact f=new fact();
        System.out.println(f.facto(5));
    }
}
