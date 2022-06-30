package DynamicProgramming;
import java.util.*;
public class Tabulation {
    public static void main(String[] args) {
        int n=5;
        int []fiboArray=new int[n+1];
        Arrays.fill(fiboArray, -1);
        fiboArray[0]=0;
        fiboArray[1]=1;
        for (int i = 2; i <=n ; i++) {
            fiboArray[i]=fiboArray[i-1]+fiboArray[i-2];
        }
        System.out.println(fiboArray[n]);

    }
}
