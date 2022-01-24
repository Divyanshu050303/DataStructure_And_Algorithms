package Question;
import java.util.Scanner;
/**
 *  write a recursive function to convert a given string into the number it represents.
 *  That is input will be a numeric string that contains only numbers, you need to convert the string into
 *  a corresponding integer and return the answer.
 *
 * Sample Input:
 * “2029”
 *
 * Sample Output:
 * 2029
 */
class stringToNumber
{
    public void convert(String s, int size){
        if(size==s.length()){
            return;
        }
        System.out.print(Integer.parseInt(String.valueOf(s.charAt(size))));
        convert(s, size+1);
    }
}
public class Question16 {
    public static void main(String[] args) {
        stringToNumber sn=new stringToNumber();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sn.convert(s, 0);
    }
}
