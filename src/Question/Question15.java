package Question;
import java.util.*;
/*
* In a string S, remove consecutive duplicates from it recursively.

Sample Input 1 :
aabccba
Sample Output 1 :
abcba*/
class duplicate
{
    String str="";
    public void consecutive(String s, int size)
    {
        if(size>=s.length()-1){
            System.out.println(s);
            return;
        }
        if(s.charAt(size) == s.charAt(size+1))
        {
            str+="";

        }
        else {
            str+=s.charAt(size);
        }
        consecutive(s, size+1);
    }

}
public class Question15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        duplicate d=new duplicate();
        String s=sc.nextLine();
        d.consecutive(s, 0);
    }
}
