package Arrays.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1#
class subArray{
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

    }
    public void subSet(){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:arr) {
            int size=outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
    }
}
public class SubarrayWith0Sum {
}
