package Stacks;
import java.util.*;

class greater
{
     int []arr;
     int size;
    greater()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter the element in the array");
        for (int i = 0; i <size ; i++) {
            arr[i]=sc.nextInt();
        }
    }
    public void nextGreaterInteger()
    {
        Vector <Integer>v=new Vector<>();
        Stack <Integer> s=new Stack<>();

        for (int i = size-1; i >=0 ; i--) {// we traverse the array from the last
            if(s.size() == 0)//if size of satck is equal to  zero than we add -1 in vector
            {
                v.add(-1);
            }
            else if(s.peek()>arr[i]) // if size of stack is greater than zero and top of stack is greater than the current array element
            {
                v.add(s.peek());// then we add top element of stack in the vector
            }
            else if(s.size()>0 && s.peek()<=arr[i])
            {
                while(s.size()>0 && s.peek()<=arr[i])// if size of the stack is greater than zero and the top of the stack is less than or equal to the current element of array
                {
                    s.pop();   // pop the top of the stack
                }
                if(s.size()==0)// now we check in while loop  which condition became false if size became less than zero
                {
                    v.add(-1);// then add -1 in the vector
                }
                else
                {
                    v.add(s.peek());// else add the top of the stack
                }

            }

            s.push(arr[i]);// here we push the array element in the stack

        }
        System.out.print("The actual array is>>");// now time to print the actual array
        for (int i = 0; i <size ; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.print("\nAfter find the nearest greater to right ");
        Collections.reverse(v);// actually  we traverse the array at the last ,so we need to reverse the vector to get the appropriate result
        Enumeration<Integer> vnum=v.elements();  // Now this is the way to print the collections in java
        while (vnum.hasMoreElements())
        {
            System.out.print(" "+vnum.nextElement());
        }
    }
}
public class nearestGreaterToRight {
    public static void main(String[] args) {
        greater g=new greater();
        g.nextGreaterInteger();


    }
}
