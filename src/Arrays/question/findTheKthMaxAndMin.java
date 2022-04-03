package Arrays.question;
import java.util.Scanner;
class find2{
    int []arr;
    int size, max, min;
    public void insert1(){
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter the element in the array");
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Which maximum number do you want");
        max=sc.nextInt();
        System.out.println("Which minimum number do you want");
        min=sc.nextInt();
        traversal();
        maxMin2();
    }
    public void traversal(){
        System.out.println("Array which has you entered");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void maxMin2(){
        for (int i=0;i<size;i++){
            for (int j = 0; j < size-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Maximum number whichever you want "+arr[size-max]);
        System.out.println("Minimum number whichever you want "+arr[min-1]);
    }
}
public class findTheKthMaxAndMin {
    public static void main(String[] args) {
        find2 f=new find2();
        f.insert1();
    }
}
