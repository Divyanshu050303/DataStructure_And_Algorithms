package Question;
import java.util.Scanner;
/*
*  Write a program to find out and return the number of digits present in a number recursively.

Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1*/
class present
{
    int digit=0;
    public int digits(int num)
    {
        if(num>0) {

            digits(num / 10);
            digit+=1;
        }
        return digit;
    }
}
public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        present p=new present();
        System.out.println("The number of digits in the given number :"+p.digits(sc.nextInt()));
    }
}
