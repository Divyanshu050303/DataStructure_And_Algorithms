package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class dis{
    Set<Integer> set = new HashSet<>();
    int size, combinationSize;
    public void insert(){
        System.out.println("Enter the Size of the array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        System.out.println("Enter the element in the array");


        for (int i = 0; i < size; i++) {
             set.add(sc.nextInt());
        }

        System.out.println("Enter the size of combination");
        combinationSize=sc.nextInt();
    }
    public void combinations(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int n:set){
            arrayList.add(n);
            for (int j: set) {
                arrayList.add(j);
                if(arrayList.size()==combinationSize){
                    System.out.println(arrayList);
                    arrayList.remove(combinationSize-1);
                }
            }
            arrayList.clear();
        }
    }
}
public class distinctCombinations {
    public static void main(String[] args) {
        dis s=new dis();
        s.insert();
        s.combinations();
    }
}
