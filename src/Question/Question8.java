package Question;
import java.math.BigDecimal;
import java.util.Scanner;
/*
* Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
Do this recursively.
Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Sample Input 1 :
 3 4
Sample Output 1 :
81
* */
class power
{
    int x, n;
    public int findThePower(int x , int n)
    {
        this.x=x;
        this.n=n;

        if (n == 0)
            return 1;
        else
            return (x * findThePower(x, n - 1));
    }
}
public class Question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        power p=new power();
        System.out.println(p.findThePower(sc.nextInt(), sc.nextInt()));
    }
}
