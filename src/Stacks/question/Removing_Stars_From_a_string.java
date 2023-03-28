package Stacks.question;

import java.util.Stack;

public class Removing_Stars_From_a_string {
    public String removeStars(String s) {

        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        String s2="";
        for(char c:stack){
            s2+=c;
        }
        return s2;
    }
}
