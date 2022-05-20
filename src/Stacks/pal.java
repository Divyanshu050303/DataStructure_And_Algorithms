package Stacks;
class stack4
{
    private int top;
    private  int maxSize;
    String t;
    private  String [] charStackArray;
    stack4(int s)
    {
        maxSize=s;
        charStackArray=new String[maxSize];
        top=-1;
    }
    public void push(String j)
    {
        charStackArray[++top]=j;

    }
    public void pop()
    {
        String s="";
        while (top>=0)
        {
             s+=charStackArray[top];
            top--;
        }
        if(t.equals(s))
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
    public void palan(String nuk)
    {

        t=nuk;
        for (int i = 0; i <nuk.length() ; i++) {
            push(nuk.charAt(i)+"");
        }
    }

}
public class pal {
    public static void main(String[] args) {
        stack4 s=new stack4(5);
        s.palan("121");
        s.pop();
    }
}
