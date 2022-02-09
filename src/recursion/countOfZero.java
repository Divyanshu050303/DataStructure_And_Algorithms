package recursion;
class zero
{
    int cl=0;
    public int count(long n, int c)
    {
        if(n==0)
        {
            return c;
        }
        if(n%10==0)
        {
            return count(n/10, c+1);
        }
        return count(n/10, c);
    }
}
public class countOfZero {
    public static void main(String[] args) {
        zero s=new zero();
        System.out.println(s.count(201500236, 0));
    }
}

