package DynamicProgramming;
import java.util.Arrays;
public class FrogJumpwithKDistance {
    static int distance(int index, int []height, int []dpArray, int k){
        if(index==0)return 0;
        if(dpArray[index]!=-1)return dpArray[index];
        int minimumStep=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(index-i>=0){
                int jump=distance(index-i, height, dpArray, k)+Math.abs(height[index]-height[index-i]);
                minimumStep=Math.min(jump, minimumStep);
            }
        }
        return dpArray[index]=minimumStep;
    }

    public static void main(String[] args) {
        int []height={30,10,60 , 10 , 60 , 50};
        int n=height.length;
        int []dpArray=new int[n];
        Arrays.fill(dpArray, -1);
        int k=2;
        System.out.println(distance(n-1, height, dpArray, k));
    }
}
