package Arrays.question;
import java.util.Scanner;
class reverse{
    int []arr;
    int size;

    public void insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
        System.out.println("Enter the element in the array");
        arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Actual Array is ...");
        traversal();
        System.out.println("After the reverse the array ...");
        reverseTheArray();
    }
    public void traversal(){
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void reverseTheArray(){
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
public class ReverseTheArray {
    public static void main(String[] args) {
        reverse r=new reverse();
        r.insert();
    }

}
