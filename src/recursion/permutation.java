package recursion;
class per
{
    public void mu(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i, p.length());
            mu(f+ch+s, up.substring(1));
        }
    }
}
public class permutation {
    public static void main(String[] args) {
        per p=new per();
        p.mu("", "abc");
    }
}
