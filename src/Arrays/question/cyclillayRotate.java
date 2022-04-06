package Arrays.question;

import java.util.Scanner;

class rotate{
    int []arr;
    int size;
    public void insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
        System.out.println("Enter the element in the array");
        arr=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The actual array is ...");
        printTheArray(arr);
        System.out.println("After the cycle rotation");
        cycle();
        printTheArray(arr);
    }
    public void cycle(){
        int temp=arr[size-1];
        for (int i = size-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    public void printTheArray(int []arr){
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class cyclillayRotate {
    public static void main(String[] args) {
        rotate r=new rotate();
        r.insert();
    }
}
