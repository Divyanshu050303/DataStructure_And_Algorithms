package DynamicProgramming;
import java.util.Arrays;
public class FrogJump {
    static int frog(int index, int [] array, int []dpArray){
        if(index==0){
            return 0;
        }
        if(dpArray[index]!=-1)
            return dpArray[index];
        int jumpTwo=Integer.MAX_VALUE;
        int jumpOne=frog(index-1, array, dpArray)+Math.abs(array[index]-array[index-1]);
        if(index>1)
             jumpTwo=frog(index-2, array, dpArray)+Math.abs(array[index]-array[index-2]);
        return dpArray[index]=Math.min(jumpOne, jumpTwo);
    }

    public static void main(String[] args) {

        int []height={30,10,60 , 10 , 60 , 50};
        int n=height.length;
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(frog(n-1,height,dp));
    }
}
