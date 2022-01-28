package Stacks;
import java.util.Scanner;
class stack2
{
    private int top;
    private  int maxSize;
    private  char [] charStackArray;
    stack2(int s)
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
class BracketChecker
{
    private String input;
    BracketChecker(String in)
    {
        input=in;
    }
    public void check()
    {
        int stackSize=input.length();
        stack2 st=new stack2(stackSize);
        for (int i = 0; i < stackSize; i++) {
            char ch=input.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    st.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!st.isEmpty())
                    {
                        char chx=st.pop();
                        if((ch=='}' && chx!='{') ||
                    (ch==']' && chx!='[') ||
                    (ch==')' && chx!='(') )
                        {
                            System.out.println("Error: "+ch+" at "+i);
                        }

                    }
                    else{
                        System.out.println("Error: "+ch+" at "+i);
                    }
                    break;
                default:
                    break;
            }
        }
        if(!st.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }

    }
}
public class checkMatchingBrackets {
    public static void main(String[] args) {
        String input;
        while(true)
        {
            System.out.println("Enter the string containing delimiters: ");

                Scanner sc=new Scanner(System.in);
                input=sc.nextLine();
                if(input.equals(""))
                {
                    break;
                }
                BracketChecker bck=new BracketChecker(input);
                bck.check();
        }
    }
}