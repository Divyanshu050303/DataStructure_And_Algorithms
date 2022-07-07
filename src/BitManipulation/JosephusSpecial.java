package BitManipulation;

import java.util.Scanner;

public class JosephusSpecial {
    public static int solution(int n){
        int i=1;
        while(i*2<=n){
            i*=2;
        }
        int l=n-i;
        return 2*l+1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solution(n));
    }
}
