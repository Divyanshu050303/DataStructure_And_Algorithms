package Arrays;

import java.util.Scanner;
class operation{
    int []array;
    int size, index, element;
    operation()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        size=sc.nextInt();
        array=new int[size];
        System.out.println("Enter the element in the array");
        for (int i = 0; i <size ; i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Choose the operation");
        System.out.println("""
                 1 -> Traversal the array\s
                 2 -> Get the value
                 3 -> Search the value\s
                 4 -> Delete the element by index\s
                 5 -> Delete the element by the value
                 6 -> Delete the whole array\s
                 7 -> Insert the value\s
                 8 -> Insert the value at particular index""");
        int choose= sc.nextInt();
        switch (choose) {
            case 1 -> traverse(array, size);
            case 2 -> getvalue(array);
            case 3 -> search(array);
            case 4 -> delete(array);
            case 5 -> delete2(array, size);
            case 6 -> deletearray(array);
            case 7 -> insert(array, size);
            case 8 -> insert2(array);
            default -> System.out.println("Sorry wrong choose");
        }

    }
    public void display(int []arr, int size)
    {
        System.out.println("After performing the operation the array is: ");
        for (int j:arr) {
            System.out.print(j+" ");

        }
    }
    // This method insert the value at last in the array
    public void insert(int []arr, int size)
    {
        int []arra;
        arra=new int[size+1];
        for (int i = 0; i < size; i++) {
            arra[i]=arr[i];
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value which you want to insert in the array");
        int value=sc.nextInt();
        arra[size]=value;

        display(arra,(size+1));
    }
    // this method insert the element at a particular index
    public void insert2(int []arr){
        System.out.println("Enter the element which you want to insert in the array");
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        System.out.println("Enter the index in which you insert the value");
        int index=sc.nextInt();
        int []arra;
        arra=new int[size+1];
        try
        {
            for (int i = 0; i < size + 1; i++)
            {
                if (i < index - 1)
                    arra[i] = arr[i];
                else if (i == index - 1)
                    arra[i] = value;
                else
                    arra[i] = arr[i - 1];
            }
            display(arra,(size+1));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }

    }

    // Traverse the array
    public void traverse(int []arr, int size)
    {
        System.out.println("After the Array traversal");
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    // Get the value from the array
    public void getvalue(int []arr)
    {
        System.out.println("Enter the index ");
        Scanner sc=new Scanner(System.in);
        int index= sc.nextInt();
        try
        {
            System.out.println(arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("invalid index");
        }
    }
    // Search the value in the array
    public void search(int []arr)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value which you want to search");
        int value=sc.nextInt();
        for (int j : arr) {
            if (j == value) {
                System.out.println("value found");
                return;
            }
        }
        System.out.println("value not found ");

    }
    // Delete the value by the using the index
    public void delete(int []arr)

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index which you want to delete");
        int value=sc.nextInt();
        try
        {
            arr[value]= 0;
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("invalid index");
        }
        display(arr,size);
    }
    // Delete the value by the using the actual value
    public void delete2(int []arr, int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value which you want to delete");
        int value=sc.nextInt();
        try
        {
            for (int j=0;j<size;j++) {
                if (arr[j] == value) {
                    arr[j]=0;
                    display(arr,size);
                    return;
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("invalid index");
        }

    }
    // method to delete whole the array
    public void deletearray(int []arr)
    {
        arr= null;


    }
}
public class Array_Basic_Operation {
    public static void main(String[] args) {
        operation op=new operation();
    }
}