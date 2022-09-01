package recursion;

import java.util.Scanner;

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
//        fact f=new fact();
//        System.out.println(f.facto(5));
        int fac=1;
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        System.out.println(fac);

    }
}
