package BitManipulation;

import java.util.Scanner;

class binary{
    String s1,s2;
    public void add(){
        System.out.println("Enter the first binary ");
        Scanner sc=new Scanner(System.in);
        s1=sc.next();
        System.out.println("Enter the second binary");
        s2=sc.next();
        String s="";
        String re="";
        int sum=Integer.parseInt(s1,2)+Integer.parseInt(s2,2);
        System.out.println(sum);
        while(sum>0){
            s+=sum%2;
            sum/=2;
        }
        for(int i=s.length()-1;i>=0;i--){
            re+=s.charAt(i);
        }

        System.out.println(re);
    }
}
public class addTwoBinaryNumber {
    public static void main(String[] args) {
        binary b=new binary();
        b.add();
    }
}
