package string;

public class PalindromeString {
   static int isPalindrome(String S) {
        String c=S;
        String v="";
        int j=1;
        for(int i=S.length()-1;i>=0;i--){
            v+=c.charAt(i);
        }
       System.out.println(v);
        if(v.equals(S)){
            j=0;
        }
        return j;
    }
    public static void main(String[] args) {
       String s="abba";
        System.out.println(isPalindrome(s));
    }
}
