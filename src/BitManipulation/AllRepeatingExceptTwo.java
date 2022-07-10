package BitManipulation;

import java.util.Scanner;

public class AllRepeatingExceptTwo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        solution(arr);
    }

    public static void solution(int[] arr){
        int xor=0;
        for(int i:arr){
            xor=xor^i;
        }
        int rms=xor&-xor;
        int x=0;
        int y=0;
        for(int i:arr){
            if((i&rms)==0){
                x^=i;
            }
            else{
                y^=i;
            }
        }
        if(x<y){

            System.out.println(x);
            System.out.println(y);
        }
        else{

            System.out.println(y);
            System.out.println(x);
        }

    }
}
