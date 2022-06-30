package DynamicProgramming;

import java.util.Arrays;

public class Fibonacci {
    static int fibo(int n, int []fiboArrya){
        if(n<=1)
            return n;
        if(fiboArrya[n]!=-1)
            return fiboArrya[n];
        return fiboArrya[n]=fibo(n-1,fiboArrya)+fibo(n-2,fiboArrya);
    }
 static int fibo2(int n){
        int []fiboArray=new int[n+1];
        Arrays.fill(fiboArray, -1);
        if(n<=1)
            return n;
        if(fiboArray[n]!=-1)
            return fiboArray[n];
        return fiboArray[n]=fibo2(n-1)+fibo2(n-2);
 }
    public static void main(String[] args) {
        int n=3;
        int []fiboArray=new int[n+1];
        Arrays.fill(fiboArray, -1);
//        System.out.println(fibo(n, fiboArray));
        System.out.println(fibo2(n));
    }
}
