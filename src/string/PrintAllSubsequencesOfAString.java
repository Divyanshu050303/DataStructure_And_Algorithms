package string;

import java.util.Scanner;

class print{
    String str;
    public void insert(){
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        string("", str);

    }
    public void string(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        string(p, up.substring(1));
        string(p+ch, up.substring(1));

    }
}
public class PrintAllSubsequencesOfAString {
    public static void main(String[] args) {
        print p=new print();
        p.insert();
    }
}
