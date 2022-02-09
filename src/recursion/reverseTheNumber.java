package recursion;
class rev
{
    public void print(int n)
    {
        if(n==0)
        {
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
public class reverseTheNumber {
    public static void main(String[] args) {
        rev r=new rev();
        r.print(5);
    }
}
