package recursion;

import java.util.ArrayList;

class sub
{
    ArrayList<String> arrayList=new ArrayList<>();
    public void string(String p, String up)
    {
        if(up.isEmpty())
        {
//            System.out.print(p+" ");
            arrayList.add(p);
            return;
        }
        char ch=up.charAt(0);
        string(p, up.substring(1));
        string(p+ch, up.substring(1));

    }
}
public class subString {
    public static void main(String[] args) {
        sub s=new sub();
        s.string("", "abcde");
        System.out.println(s.arrayList);

    }
}
