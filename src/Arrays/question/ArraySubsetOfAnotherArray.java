package Arrays.question;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/array-subset-of-another-array2317/1
class another{
    int []arr1, subArray;
    int m, n;
    public void insert(){
        System.out.println("Enter the size of the first array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Enter the size of the second array");
        m=sc.nextInt();
        System.out.println("Enter the element in the first array");
        arr1=new int[n];
        for (int i = 0; i <n ; i++) {
            arr1[i]= sc.nextInt();
        }
        System.out.println("Enter the element in the second array");
        subArray=new int[m];
        for (int i = 0; i <m ; i++) {
            subArray[i]=sc.nextInt();
        }
        System.out.println("First array ");
        printTheArray(arr1);
        System.out.println("Second array");
        printTheArray(subArray);
        subSet();
    }
    public void printTheArray(int []arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void subSet(){
        int k=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(arr1[i]==subArray[j]){
                    k++;
                }
            }
        }
        if(k==m){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
public class ArraySubsetOfAnotherArray {
    public static void main(String[] args) {
        another n=new another();
        n.insert();
    }
}
