package BitManipulation;

import java.util.Scanner;
//https://leetcode.com/problems/power-of-three/submissions/
class power2{
    int n;
    public boolean two(){
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        int s= sc.nextInt();

        while (n>1 && n%4==0){
            n/=4;
        }

        if(n==1.0){
            return true;
        }

        return false;

    }
}
public class PowerOfThree {
    public static void main(String[] args) {
        power2 p=new power2();
        System.out.println(p.two());
    }
}
