package Question;
import java.util.Scanner;
/*
* Write a program to print numbers from 1 to n in increasing order recursively.

Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6*/
class number
{
    public void print(int n)
    {
        if(n>0)
        {
            print(n-1);
            System.out.print(n+" ");
        }

    }
}
public class Question9 {
    public static void main(String[] args) {
        number n=new number();
        Scanner sc=new Scanner(System.in);
        n.print(sc.nextInt());
    }
}
