package Sorting.array;
import java.util.Scanner;
class quick{
    private int []arr;
    private int size;
    quick(int size){
        this.size=size;
        insert();
    }
    public void insert(){
        arr=new int[size];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Sorting");
        displayArray(arr);
        quickSorting(arr, 0, arr.length-1);
        System.out.println("After Sorting");
        displayArray(arr);
    }
    public int partition(int []arr, int low, int high){
        int pivot=arr[(low+high)/2];
        while (low<=high){
            while (arr[low]<pivot){
                low++;
            }
            while (arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
    public void quickSorting(int []arr, int low , int high)
    {
        int pi=partition(arr, low, high);
        if(low<pi-1){
            quickSorting(arr, low, pi-1);
        }
        if(pi<high){
            quickSorting(arr, pi, high);
        }
    }
    public void displayArray(int []arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
public class quickSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int size=sc.nextInt();
     quick q=new quick(size);

    }
}
