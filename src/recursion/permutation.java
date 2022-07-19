package recursion;

import java.util.ArrayList;

class per
{
    ArrayList<String> arrayList=new ArrayList<>();
    public void mu(String p, String up)
    {
        if(up.isEmpty())
        {
            arrayList.add(p+"");
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i);
            mu(f+ch+s, up.substring(1));
        }
    }
}
public class permutation {
    public static void main(String[] args) {
        per p=new per();
        int k=3;
        String l="";
        for(int i=1;i<=k;i++){
            l+=i;
        }
        p.mu("", l);
        System.out.println(p.arrayList);
    }
}
