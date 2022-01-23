package Question;
import java.util.Scanner;
/*
* Write a program to find and return the sum of all elements of the array. Do this recursively.

Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7    */
class sum
{
    int sum=0;
    int []arr;
    public void getArray(int size){
        Scanner sc=new Scanner(System.in);
        arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
    }
    public int elements(int size)
    {
        if(size>=0){
            sum+=arr[size];
            elements(size-1);
        }
        return sum;
    }
}
public class Question11 {
    public static void main(String[] args) {
        sum s=new sum();
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        s.getArray(size);
        System.out.println(s.elements(size-1));
    }
}
