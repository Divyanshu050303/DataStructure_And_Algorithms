package Sorting.array;
import java.util.Scanner;
class Sorting{
    int []array;
    int []tempMergeArr;
    int size;
    Sorting(int size){
        this.size=size;
        array=new int[size];
    }
    public void insert(){
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            array[i]= sc.nextInt();
        }
        tempMergeArr=new int[size];
        display(array);
        divideArray(0, size-1);
        display(array);
    }
    public void display(int []array){
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public void divideArray(int lowerIndex, int higherIndex){
        if(lowerIndex<higherIndex){
            int middle=lowerIndex+(higherIndex-lowerIndex)/2;
            divideArray(lowerIndex, middle);
            divideArray(middle+1, higherIndex);
            mergeArray(lowerIndex,middle, higherIndex);
        }
    }
    public void mergeArray(int lowerIndex,int middle,int higherIndex){
        for (int i = lowerIndex; i <=higherIndex ; i++) {
            tempMergeArr[i]=array[i];
        }
        int first=lowerIndex;
        int second=middle+1;
        int third=lowerIndex;
        while (first<=middle && second<=higherIndex){
            if(tempMergeArr[first]<=tempMergeArr[second]){
                array[third]=tempMergeArr[first];
                first++;
            }
            else{
                array[third]=tempMergeArr[second];
                second++;
            }
            third++;
        }
        while (first<=middle){
            array[third]=tempMergeArr[first];
            third++;
            first++;
        }
    }
}
public class mergeSort {
    public static   void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= sc.nextInt();
        Sorting s=new Sorting(size);
        s.insert();
    }
}
