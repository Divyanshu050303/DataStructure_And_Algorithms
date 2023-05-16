package Sorting.array;

import java.util.Arrays;
import java.util.Scanner;
class time{
    public void countingSort(int []arr){
        int n=arr.length;
        int []b=new int[n];
        int k=arr[0];
        for (int j : arr) {
            if (k < j) {
                k = j;
            }
        }
        int []count=new int[k];
        Arrays.fill(count,0);
        for (int i = 0; i <k ; i++) {
            count[arr[i]]=count[arr[i]]+1;
        }
        for (int i = 1; i <k ; i++) {
            count[i]+=count[i-1];
        }
        for (int i = n-1; i >=1 ; i--) {
            b[count[arr[i]]]=arr[i];
            count[arr[i]]=count[arr[i]]-1;
        }
    }
}
public class counting {
    public static void main(String[] args) {
        int []arr={170, 45, 75, 96, 24, 2, 66};
        time t=new time();
        t.countingSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
