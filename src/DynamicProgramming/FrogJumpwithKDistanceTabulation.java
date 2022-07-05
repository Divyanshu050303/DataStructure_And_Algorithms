package DynamicProgramming;

import java.util.Arrays;

public class FrogJumpwithKDistanceTabulation {
    static int distance(int n,int[]height, int []dpArray, int k){
        dpArray[0]=0;
        for (int i=1;i<n;i++){
            int minimumSteps=Integer.MAX_VALUE;
            for (int j = 1; j <=k ; j++) {
                if(i-j>=0){
                    int jump=dpArray[i-j]+Math.abs(height[i]-height[i-j]);
                    minimumSteps=Math.min(jump, minimumSteps);
                }
            }
            dpArray[i]=minimumSteps;
        }
        return dpArray[n-1];
    }

    public static void main(String[] args) {
        int []height={30,10,60 , 10 , 60 , 50};
        int n=height.length;
        int []dpArray=new int[n];
        Arrays.fill(dpArray, -1);
        int k=2;
        System.out.println(distance(n, height, dpArray, k));
    }
}
