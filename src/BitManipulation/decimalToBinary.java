package BitManipulation;

import java.util.Scanner;

class decimal{
    int num;
    public void binary(){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        String s="";
        String d="";
        String re="";
        int sum=0;
        while(num>0){
            s+=num%2;
            num/=2;
        }
        for(int i=s.length()-1;i>=0;i--){
            re+=s.charAt(i);
        }
        for (int i = 0; i <re.length() ; i++) {
            if(re.charAt(i)=='1'){
                d+="0";
            }
            else{
                d+="1";
            }
        }int k=0;
//        for (int i = d.length()-1; i >=0 ; i--) {
//
//            sum+=(Character.getNumericValue(d.charAt(i)))*(2^k);
//            k++;
//        }
       sum= Integer.parseInt(d,2);
        System.out.println("Binary"+re);
        System.out.println("Complement"+d);
        System.out.println("Complement decimal number"+sum);

    }
}
public class decimalToBinary {
    public static void main(String[] args) {
        decimal d=new decimal();
        d.binary();
    }
}
