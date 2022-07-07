package BitManipulation;

import java.util.Scanner;

public class KernighanAlgorithm {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int counter=0;
        while(n!=0){
            int rsm=n&-n;
            n-=rsm;
            counter++;
        }
        System.out.println(counter);
    }
}
