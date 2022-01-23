package Question;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a program to input the elements of a two- dimensional array. Then from this array, make two arrays one that stores
 all odd elements of the two-dimensional array and the other that stores all even elements of the array

Note:-  Resulting arrays will be of ArrayList type
 */
class evenOddArray
{
    int [][]array;
    ArrayList<Object> evenArray;
    ArrayList<Object> oddArray;
    int row, column;

    evenOddArray(int r, int c)
    {
        row=r;
        column=c;
        array=new int[row][column];
    }
    public void getArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element in the array");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
    }
    public void evenOdd()
    {
        evenArray=new ArrayList<>();
        oddArray=new ArrayList<>();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(array[i][j]%2==0)
                {
                    evenArray.add(array[i][j]);
                }
                else
                {
                    oddArray.add(array[i][j]);
                }
            }
        }
        System.out.println("Even arrayList is :"+evenArray);
        System.out.println("Odd arrayList is :"+oddArray);
    }
}

public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row :");
        int row=sc.nextInt();
        System.out.println("Enter the column :");
        int column= sc.nextInt();
        evenOddArray eoa=new evenOddArray(row, column);
        eoa.getArray();
        eoa.evenOdd();
    }
}
