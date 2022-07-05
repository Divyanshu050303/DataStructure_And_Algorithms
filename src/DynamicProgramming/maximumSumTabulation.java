package DynamicProgramming;

import java.util.Arrays;

public class maximumSumTabulation {
    static int maxTabulation(int index, int [] array, int []dpArray){
        dpArray[0]=array[0];
        for (int i=1;i<index;i++){
            int pick=array[i];
            if(i>1)
                pick+=dpArray[i-2];
            int nonPick=dpArray[i-1];
            dpArray[i]=Math.max(pick, nonPick);
        }
        return dpArray[index-1];
    }

    public static void main(String[] args) {
        int[] array={2,1,4,9};
        int n=array.length;
        int []dpArray=new int[n];
        Arrays.fill(dpArray, -1);
        System.out.println(maxTabulation(n, array, dpArray));
    }
}
