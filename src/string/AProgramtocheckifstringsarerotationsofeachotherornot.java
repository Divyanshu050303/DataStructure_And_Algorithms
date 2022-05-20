package string;

import java.util.Scanner;

//https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/
class program{
    String str1, str2;
    public void inset(){
        System.out.println("Enter the first string");
        Scanner sc=new Scanner(System.in);
        str1= sc.next();
        System.out.println("Enter the second string");
        str2=sc.next();
        if(check()){
            System.out.println("String are rotational of each other");
        }
        else {
            System.out.println("String are not rotational of each other");
        }
    }
    public boolean check(){
        return str1.length()==str2.length() && (str1+str2).indexOf(str2)!=-1;
    }
}
public class AProgramtocheckifstringsarerotationsofeachotherornot {
    public static void main(String[] args) {
        program p=new program();
        p.inset();
    }
}
