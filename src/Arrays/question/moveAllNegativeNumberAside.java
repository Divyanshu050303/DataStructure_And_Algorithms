package Arrays.question;
import java.util.Scanner;
class move{
    int []arr;
    int size;
    public void insert(){
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        System.out.println("Enter the element in the array");
        arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("The array you have entered");
        traversal();
        negative();
        System.out.println("After collect all the negative number to one side of the array ");
        traversal();
    }
    public void traversal(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void negative(){
        for(int i = 0; i <size ; i++) {
            for (int j = 0; j <size-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
public class moveAllNegativeNumberAside {
    public static void main(String[] args) {
        move m=new move();
        m.insert();
    }
}
