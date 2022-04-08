package Arrays.question;
import java.util.Scanner;
class union{
    int []arr;
    int size1,size2;
    public void insert(){
        System.out.println("Enter the size of first array");
        Scanner sc=new Scanner(System.in);
        size1=sc.nextInt();
        System.out.println("Enter the size of second array");
        size2=sc.nextInt();
        arr=new int[size1+size2];

        System.out.println("Enter the element in the first array");
        for (int i = 0; i <size1 ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element in the second array");
        for (int i = size1; i <size2+size1 ; i++) {
            arr[i]=sc.nextInt();
        }
    }
    public void traversal(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public void arrayUnion(){

    }
}
public class unionOfArray {
}
