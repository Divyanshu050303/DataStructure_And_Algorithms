package BitManipulation;

import java.util.Scanner;
//https://leetcode.com/problems/power-of-two/submissions/
class power{
    int n;
    public boolean two(){
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        int s= sc.nextInt();

        while (n>1 && n%2==0){
            n/=2;
        }

        if(n==1.0){
            return true;
        }

        return false;

    }
}
public class PowerOfTwo {
    public static void main(String[] args) {
        power p=new power();
        System.out.println(p.two());
    }
}
