package string;

import java.util.*;

public class buddyString {
    public static void main(String[] args) {
        String s="aaaaaaacb";
        String goal="aaaaaaabc";
        if(s.length()!=goal.length()){
            System.out.println(false);;
        }
        if(s.equals(goal)){
            Set<Character> st=new HashSet<>();
            for( char f:s.toCharArray()){
                st.add(f);
            }
            System.out.println( st.size()<s.length());
        }
        List<Integer> d=new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!=goal.charAt(i)){
                d.add(i);
            }
        }
        System.out.println( d.size()==2 && s.charAt(d.get(0))== goal.charAt(d.get(1)) &&s.charAt(d.get(1))== goal.charAt(d.get(0)));
    }
}
