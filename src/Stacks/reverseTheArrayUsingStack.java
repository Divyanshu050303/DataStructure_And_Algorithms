package Stacks;
import java.util.Scanner;
class stack1
{
    private int top;
    private  int maxSize;
    private  char [] charStackArray;
    stack1(int s)
    {
        maxSize=s;
        charStackArray=new char[maxSize];
        top=-1;
    }
    public void push(char j)
    {
        charStackArray[++top]=j;
    }
    public char pop()
    {
        return charStackArray[top--];
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
}
class reverseChar
{
    private final String input;
    private String output;
    public reverseChar(String in)
    {
        input=in;
    }
    public String doRev() {
        int stackSize=input.length();
        stack1 st = new stack1(stackSize);
        for (int i = 0; i < stackSize; i++) {
            char ch=input.charAt(i);
            st.push(ch);
        }
        output="";
        while (!st.isEmpty())
        {
            char ch=st.pop();
            output+=ch;
        }
        return output;
    }
}
public class reverseTheArrayUsingStack {
    public static void main(String[] args)   {
        String input, output;
        while (true)
        {
            System.out.println("Enter the string :");
            Scanner sc=new Scanner(System.in);
            input=sc.nextLine();
            if(input.equals(""))
            {
                break;
            }
            reverseChar rev=new reverseChar(input);
            output=rev.doRev();
            System.out.println("Reversed: "+output);
        }
    }
}