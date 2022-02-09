package recursion;
class pal
{
    String str="";
    public void print(int n)
    {
        if(n%10==n/10)
        {
            return;
        }
        str+=n%10;
        print(n/10);
    }
    public void palin(int num)
    {
        print(num);
        if(num==(Integer.parseInt(str)))
        {
            System.out.println(num+" is Palindrome");
        }
        else
        {
            System.out.println(num+" is not Palindrome");
        }
    }

}
public class palindrome {
    public static void main(String[] args) {
        pal p=new pal();
        p.palin(121);
    }
}
