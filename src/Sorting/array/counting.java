package Sorting.array;

import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []a=new int[size];
        int[]b;
//
        for (int i = 0; i < size; i++) {
            a[i]=sc.nextInt();
        }
        int t=a[0];
        for (int i = 0; i < size; i++) {
            if(t<a[i]){
                t=a[i];
            }
        }
        t=t+1;
        System.out.println(t);
        int []c=new int[t];
        b=new int[size];
        for (int j = 0; j <t ; j++) {
            for (int i = 1; i <size ; i++) {
                c[a[i]]=c[a[i]]+1;
            }
            for ( j = 1; j < t; j++) {
                c[j]=c[j]+c[j-1];
            }
            for (int i = size-1; i >=1 ; i--) {
                b[c[a[i]]]=a[i];
                c[a[i]]=c[a[i]]-1;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
