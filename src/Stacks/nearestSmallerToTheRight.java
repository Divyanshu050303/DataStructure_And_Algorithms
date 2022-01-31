package Stacks;
import java.util.*;
class Right
{
    int []array;
    int size;
    Right()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
        System.out.println("Enter the element in the array");
        array=new int[size];
        for (int i = 0; i <size ; i++) {
            array[i]=sc.nextInt();
        }
    }
    public void smallerToTheRight()
    {
        Vector<Integer> v=new Vector<>();
        Stack <Integer> s=new Stack<>();
        for (int i=size-1;i>=0;i--)
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
        System.out.print("The actual array element is >>");
        for (int i = 0; i < size; i++) {
            System.out.print(" "+array[i]);
        }
        Enumeration <Integer> vnum=v.elements();
        Collections.reverse(v);
        System.out.print("\nThe nearest Smaller to the Right");
        while (vnum.hasMoreElements())
        {
            System.out.print(" "+vnum.nextElement());
        }
    }

}
public class nearestSmallerToTheRight {
    public static void main(String[] args) {
        Right r=new Right();
        r.smallerToTheRight();
    }
}

