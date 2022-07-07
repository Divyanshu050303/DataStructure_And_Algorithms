package BitManipulation;

import java.util.Scanner;

public class PrintValueOfRsbMask {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int rsb= n & -n ;

        System.out.println(Integer.toBinaryString(rsb));
    }

}
