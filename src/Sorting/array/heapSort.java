package Sorting.array;
import java.util.Scanner;
class heap{
    int []array;
    int size;
    heap(int size){
        this.size=size;
        array=new int[size];
        insert();
    }
    public void insert(){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <size ; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println("Before the sorting");
        display(array);
        sort();
        System.out.println("After the sorting");
        display(array);

    }
    public void sort(){
        for (int i=size/2-1;i>=0;i--){
            heapSorting(array, size, i);
        }
        for (int i = size-1; i >=0 ; i--) {
            int temp=array[0];
            array[0]=array[i];
            array[i]=temp;
            heapSorting(array, i, 0);
        }
    }
    public void heapSorting(int []array, int n, int i){
        int largest=i;
        int leftChild=2*i+1;
        int rightChild=2*i+2;
        if(leftChild<n && array[leftChild]>array[largest]){
            largest=leftChild;
        }
        if(rightChild<n && array[rightChild]>array[largest]){
            largest=rightChild;
        }
        if(largest!=i){
            int temp=array[i];
            array[i]=array[largest];
            array[largest]=temp;
            heapSorting(array, n, largest);
        }

    }
    public void display(int []array){
        for (int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
public class heapSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        heap h=new heap(n);
    }
}
