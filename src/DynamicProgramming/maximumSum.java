package DynamicProgramming;
import java.util.Arrays;
public class maximumSum {
static int maximum(int index, int[]array, int[] dpArray){
    if(index<0)return 0;
    if(index==0)return array[index];
    if(dpArray[index]!=-1)return dpArray[index];
    int pick=array[index]+maximum(index-2, array, dpArray);
    int NotPick=maximum(index-1, array, dpArray);
    return dpArray[index]=Math.max(pick, NotPick);
}

    public static void main(String[] args) {
        int[] array={2,1,4,9};
        int n=array.length;
        int []dpArray=new int[n];
        Arrays.fill(dpArray, -1);
        System.out.println(maximum(n-1, array, dpArray));
    }
}
