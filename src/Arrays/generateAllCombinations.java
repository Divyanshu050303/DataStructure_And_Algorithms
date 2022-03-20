package Arrays;
import java.util.ArrayList;
import java.util.Scanner;
class distinct{
    int []array1;
    int size, combinationSize;
    public void insert(){
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        System.out.println("Enter the element in the array");
        array1=new int[size];

        for (int i = 0; i < size; i++) {
            array1[i]= sc.nextInt();
        }
        System.out.println("Enter the size of combination");
         combinationSize=sc.nextInt();
    }
    public void combinations(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i=0;i<size;i++){
            arrayList.add(array1[i] );
            for (int j = 0; j <size ; j++) {
                arrayList.add(array1[j]);
                if(arrayList.size()==combinationSize){
                    System.out.println(arrayList);
                    arrayList.remove(combinationSize-1);
                }
            }
            arrayList.clear();
        }
    }
}
public class generateAllCombinations {
    public static void main(String[] args) {
        distinct d=new distinct();
        d.insert();
        d.combinations();
    }
}
