package BitManipulation;

import java.util.Scanner;

class repeating{
    int []arr;
    int size;
    public void insert(){
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        size= sc.nextInt();
        System.out.println("Enter the element in the array");
        arr=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
    }
    public void manipulation(){
        int xor=0;
        for (int i = 0; i <size ; i++) {
            xor=xor^arr[i];
            if(xor>0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
public class NonRepeatingNumbers {
    public static void main(String[] args) {
        repeating r=new repeating();
        r.insert();
        r.manipulation();
    }
}
