package DynamicProgramming;
import java.util.Arrays;
public class MinimumPathSumInAGrid {
    static int minimumSumPath(int i, int j, int [][]matrix, int [][]dpArray){
        if(i==0 && j==0)
            return matrix[0][0];
        if(i<0 || j< 0)
            return (int)Math.pow(10, 9);
        if(dpArray[i][j]!=-1)
            return dpArray[i][j];
        int up=matrix[i][j]+minimumSumPath(i-1, j, matrix, dpArray);
        int left=matrix[i][j]+minimumSumPath(i, j-1, matrix, dpArray);
        return dpArray[i][j]=Math.min(up,left);
    }
    static int minSumPath(int n, int m, int[][] matrix){
        int[][] dp=new int[n][m];
        for(int []row: dp)
            Arrays.fill(row,-1);
        return minimumSumPath(n-1,m-1,matrix,dp);

    }
    public static void main(String []args) {

        int [][] matrix= {{5,3},{4,0},{2,1}};

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println(minSumPath(n,m,matrix));
    }
}
