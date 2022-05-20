package Arrays.question;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
class kadane{
    int []arr;
    int size;
    public void insert(){
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        System.out.println("Enter the element in the array");
        arr=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]= sc.nextInt();
        }
        traversal();
        Kadane();
    }
    public void traversal(){
        for (int i = 0; i <size ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void Kadane(){
        int maxSum=arr[0];
        int currentSum=0;
        for (int i = 0; i < size; i++) {
            currentSum=Math.max(arr[i], currentSum+arr[i]);
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
        }
        System.out.println(maxSum);
    }
}
public class KadaneAlgorithm {
    public static void main(String[] args) {
        kadane k=new kadane();
        k.insert();
    }
}
