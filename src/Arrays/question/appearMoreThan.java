package Arrays.question;

import java.util.Scanner;

//https://www.geeksforgeeks.org/given-an-array-of-of-size-n-finds-all-the-elements-that-appear-more-than-nk-times/
class more{
    int []arr;
    int size;
    public void insert(){
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        size= sc.nextInt();
        System.out.println("Enter the element in the array");
        arr=new int[size];
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("The actual array is ");
        print();
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        calculate(k);
    }
    public void calculate(int k){
        int sum=size/k;
        for (int i = 0; i <size ; i++) {
            if(arr[i]>=sum){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public void print(){
        for (int i=0;i<size;i++ ){
            System.out.print(arr[i]+" ");
        }
    }
}
public class appearMoreThan {
    public static void main(String[] args) {
        more m=new more();
        m.insert();
    }
}
