package Question;

import java.util.*;

/*
* Write a program to remove consecutive duplicate elements in an array.

Input values

10 10 30 30 40 50 50 50 9 45

Output

10 30 40 50 9 45*/
class consecutive
{
    int []arr;
    int size;
    consecutive()
    {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
    }
    public void removeConsecutive()
    {
       int []removeArray;
       int temp=arr[0], j=1;
       removeArray=new int[size];
        removeArray[0]=arr[0];
       for(int i=0;i<size;i++)
       {
           if(temp!=arr[i])
           {
               removeArray[j]=arr[i];
               j++;
               temp=arr[i];
           }
       }
       for(int i=0;i<j;i++)
       {
           System.out.print(removeArray[i]+" ");
       }

    }
}
public class Question4 {
    public static void main(String[] args) {
        consecutive con=new consecutive();
        con.removeConsecutive();

    }
}
