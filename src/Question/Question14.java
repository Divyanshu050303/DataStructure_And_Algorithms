package Question;
import java.util.Scanner;
/*
* Given an input string S and two characters char1 and char2, you need to replace every occurrence of character c1
* with character c2 in the given string. Do this recursively.

Sample Input :
abaca
a x
Sample Output :
xbxcd

Remove Duplicates Recursively*/
class replace
{
    String str="";
    public void character(String s, int size, char c1, char c2)

    {
        if(size==s.length())
        {
            System.out.println(str);
            return;
        }
        if(c1==s.charAt(size))
        {
            str+=c2;
        }
        else
        {
            str+=s.charAt(size);

        }
        character(s, size+1, c1, c2);

    }
}

public class Question14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        replace r=new replace();
        String s=sc.next();

        r.character(s, 0, sc.next().charAt(0), sc.next().charAt(0));

    }
}
