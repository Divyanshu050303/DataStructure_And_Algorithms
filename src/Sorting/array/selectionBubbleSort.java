package Sorting.array;

import java.util.Arrays;
import java.util.Scanner;

class sorting1{
    public int[] Bubble(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public int[] Selection(int []array){

                for (int i = 0; i < array.length-1 ; i++) {
                    int min=i;
                    for (int j = i+1; j <array.length ; j++) {
                        if(array[j]<array[min]){
                            min=j;
                        }
                    }
                    int temp=array[i];
                    array[i]=array[min];
                    array[min]=temp;
            }
                return array;
    }
}
public class selectionBubbleSort {
    public static void main(String[] args) {
        sorting1 s=new sorting1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= sc.nextInt();
        System.out.println("Enter the element in the array");
        int []arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Bubble sort"+ Arrays.toString(s.Bubble(arr)));
        System.out.println("Selection sort"+ Arrays.toString(s.Selection(arr)));
    }
}
