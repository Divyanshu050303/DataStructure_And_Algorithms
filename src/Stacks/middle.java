package Stacks;
import java.util.Scanner;
import java.util.Stack;

public class middle {
    static void delete(Stack st, int cur)
    {
        int size=st.size()/2;
        if(cur==st.size()-1)
        {
            return;
        }
        if(cur==size)
        {
            st.pop();
        }
        else{
            System.out.print(st.pop()+" ");
        }
        delete(st, cur+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Stack s=new Stack();
        for (int i = 0; i <size ; i++) {
            s.push(sc.nextInt());
        }
        delete(s, 0);

    }
}
