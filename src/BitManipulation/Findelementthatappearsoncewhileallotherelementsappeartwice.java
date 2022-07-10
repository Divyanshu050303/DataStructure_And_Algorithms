package BitManipulation;

import java.util.Scanner;

public class Findelementthatappearsoncewhileallotherelementsappeartwice {
    static void element(){
        int size;
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter the element in the array");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int unique=0;
        for (Integer i:arr) {
            unique=unique^i;
        }
        System.out.println(unique);
    }

    public static void main(String[] args) {
        element();
    }
}
