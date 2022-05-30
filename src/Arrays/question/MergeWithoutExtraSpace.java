package Arrays.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays5135/1
class merge{
    int []arr1, arr2;
    int size1, size2;
    public void insert(){
        System.out.println("Enter the size of first array");
        Scanner sc=new Scanner(System.in);
        size1=sc.nextInt();
        System.out.println("Enter the size of second array");
        size2=sc.nextInt();
        System.out.println("Enter the element in the first array");
        arr1=new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter the element in the second array");
        arr2=new int[size2];
        for (int i = 0; i <size2 ; i++) {
            arr2[i]= sc.nextInt();
        }
        merge1();
    }
    public void merge1(){

        ArrayList<Integer>arrayList=new ArrayList<>();
        for (int i = 0; i <size1 ; i++)
        {
            arrayList.add(arr1[i] );
        }
        for (int i = 0; i <size2 ; i++) {
            arrayList.add(arr2[i] );
        }
        Collections.sort(arrayList);
        for (int i:arrayList) {
            System.out.print(i+" ");
        }


    }
}
public class MergeWithoutExtraSpace {
    public static void main(String[] args) {
        merge m=new merge();
        m.insert();
    }
}
