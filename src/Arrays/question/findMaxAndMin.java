package Arrays.question;
import java.util.Scanner;
class find{
    int []arr;
    int size;
    public void insert(){
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter the element in the array");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        traversal();
        maxMin();
    }
    public void traversal(){
        System.out.println("The array you have entered");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public void maxMin(){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Maximum number in the array is "+max);
        System.out.println("Minimum number in the array is "+min);
    }
}
public class findMaxAndMin {
    public static void main(String[] args) {
        find f=new find();
        f.insert();
    }
}
