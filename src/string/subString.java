package string;

public class subString {
    public static void main(String[] args) {

        String s="divyanshu";
        String st="";
        for(char c:s.toCharArray()){
            String t=s.valueOf(c);
            if(st.contains(t)){
                st=st.substring(st.indexOf(t)+ 1);
            }
            st+=t;
            System.out.println(st);
        }
    }
}
