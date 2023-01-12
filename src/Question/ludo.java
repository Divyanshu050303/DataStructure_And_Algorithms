package Question;

import java.util.Scanner;

class array{
    int []arr;
    Scanner sc=new Scanner(System.in);
    public  void insert(){

        System.out.println("Enter the length of the array");
        int s=sc.nextInt();
        arr=new int[s];
        System.out.println("Enter the element in the array");
        for (int i = 0; i < s; i++) {
            arr[i]= sc.nextInt();
        }
    }
    public void delete(int n ){
        if(arr.length==0){
            System.out.println("Array is empty");
            return;
        }
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == n) {
                arr[i] = 0;
            }
        }
    }
    public void linearSearch(int number){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==number){
                System.out.print((i+1)+"");
                count++;
            }
        }
        System.out.println("The number of element be find in the array "+ count+"\n");
    }
    public void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public void sort(){

        int n= 2;
        System.out.println("Enter the number of student");
        int s= sc.nextInt();
        System.out.println("Enter the marks of student with theirs marks");
        int[][]arr1=new int[2][2];
        for (int i=0;i<s;i++){
            for (int j = 0; j < 1; j++) {
                arr[i]=sc.nextInt();
            }
        }
        System.out.println("Print");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(arr1[i][j]);
            }
        }
    }
}
public class ludo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        array a=new array();
        while (true){

            System.out.println("Enter 1 for insert the element in the array");
            System.out.println("Enter 2 for delete the value from the array");
            System.out.println("Enter 3 to print the arrays values");
            System.out.println("Enter 4 to search the element in the array");
            System.out.println("Enter 5 to exit");
            int c=sc.nextInt();
            switch (c){
                case 1:
                {
                    a.insert();
                    break;
                }
                case 2:{
                    System.out.println("Enter the element you want delete from the array");
                    int s= sc.nextInt();
                    a.delete(s);
                     break;
                }
                case 3:
                {
                    a.print();
                    break;
                }
                case 4:{
                    System.out.println("Enter the element you want to search in the array");
                    int s= sc.nextInt();
                    a.linearSearch(s);
                    break;
                }
                case 5 :{
                    System.exit(1);
                }
            }
        }
    }
}
