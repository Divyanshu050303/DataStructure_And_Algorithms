package string;

import java.util.ArrayList;

public class reverseTheString {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
         char [] sa=new char[5];
         sa[0]='h';
         sa[1]='e';
         sa[2]='l';
         sa[3]='l';
         sa[4]='o';
        for (int i = sa.length-1; i >=0 ; i--) {
            s.add(String.valueOf(sa[i]));
        }
        System.out.println(s);
    }
}
