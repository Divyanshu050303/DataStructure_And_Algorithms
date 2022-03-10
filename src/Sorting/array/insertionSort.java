package Sorting.array;
import java.util.Scanner;
class insertion{
    int []arr;
    int size;
    insertion(int size){
        this.size=size;
    }
    public void insert(){
        Scanner sc=new Scanner(System.in);
        arr=new int[size];
        System.out.println("Enter the element in the array");
        for (int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        display(arr);

    }
    public void display(int []arr){
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void sort(){
        for (int i = 1; i <size ; i++) {
            int temp=arr[i];
            int j=i;
            while (j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;

        }
        display(arr);
    }

}
public class insertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        insertion in=new insertion(size);
        in.insert();
        in.sort();
    }
}
