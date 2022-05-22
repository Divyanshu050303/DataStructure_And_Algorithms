package BitManipulation;


// { Driver Code Starts
// Initial Template for Java
import java.io.*;
        import java.util.*;

class NumberOf1Bits {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            bit ob = new bit();
            int cnt = ob.setBits(N);
            System.out.println(cnt);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class bit {
    static int setBits(int N) {
        String s=Integer.toBinaryString(N);
        int b=0;
        for(int i=0;i<s.length(); i++){
            if(s.charAt(i)=='1')
            {
                b+=1;
            }
        }
        return b;
    }
}