package Stacks;
import java.util.*;
class left
{
     int []array;
     int size;
    left()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
        System.out.println("Enter the element in the array");
        array=new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=sc.nextInt();
        }
    }
    public void GreaterToLeft()
    {
        Vector <Integer> v=new Vector<>();
        Stack <Integer> s=new Stack<>();
        for (int i = 0; i < size; i++) {
            if(s.size()==0)
            {
                v.add(-1);
            }
            else if(s.peek()>array[i])
            {
                v.add(s.peek());
            }
            else if(s.size()>0 && s.peek()<=array[i])
            {
                while (s.size()>0&& s.peek()<=array[i])
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
        System.out.print("The actual array element is >>");
        for (int i = 0; i < size; i++) {
            System.out.print(" "+array[i]);
        }
        Enumeration <Integer> vnum=v.elements();
        System.out.print("\nThe nearest greater to left");
        while (vnum.hasMoreElements())
        {
            System.out.print(" "+vnum.nextElement());
        }

    }
}
public class nearestGreaterToLeft {
    public static void main(String[] args) {
        left l=new left();
        l.GreaterToLeft();
    }
}
