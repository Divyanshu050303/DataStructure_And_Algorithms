package BitManipulation;

import java.util.Scanner;

public class swapingTwoNumber {
    public static void main(String[] args) {
          int a, b;
          System.out.println("Enter the first number");
          Scanner sc=new Scanner(System.in);
          a=sc.nextInt();
          System.out.println("Enter the second number");
          b= sc.nextInt();
          System.out.println("Value of a and b before swapping "+a+" "+b);

          a=a^b;
          b=a^b;
          a=a^b;
        System.out.println("Value of a and b after swapping "+a+" "+b);

    }
}
