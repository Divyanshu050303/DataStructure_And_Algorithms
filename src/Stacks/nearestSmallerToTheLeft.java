package Stacks;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

class smaller
{
    int []array;
    int size;
    smaller()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the element in the array");
        size=sc.nextInt();
        array=new int[size];
        System.out.println("Enter the element in the array");
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
    }
    public void ToTheLeft()
    {
        Stack <Integer> s=new Stack<>();
        Vector <Integer> v=new Vector<>();
        for (int i = 0; i <size ; i++)
            {
                if(s.size()==0)
                {
                    v.add(-1);
                }
                else if(s.peek()<array[i])
                {
                    v.add(s.peek());
                }
                else if(s.size()>0 && s.peek()>=array[i])
                {
                    while (s.size()>0 && s.peek()>=array[i])
                    {
                        s.pop();
                    }
                    if(s.size()==0)
                    {
                        v.add(-1);
                    }
                    else
                    {
                        v.add(s.peek());
                    }
                }
                s.push(array[i]);
            }
        System.out.print("The actual array element  is >>");
        for (int i:array) {
            System.out.print(" "+i);
        }
        Enumeration <Integer> vnum=v.elements();
        System.out.print("\nThe nearest greater to left");
        while (vnum.hasMoreElements())
        {
            System.out.print(" "+vnum.nextElement());
        }


    }

}
public class nearestSmallerToTheLeft {
    public static void main(String[] args) {
        smaller s=new smaller();
        s.ToTheLeft();
    }
}
