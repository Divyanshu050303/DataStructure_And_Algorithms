package DynamicProgramming;
import java.util.Arrays;
public class GridUniquePath2 {
    static int UniquePathWithObstacles(int i, int j, int [][]Array, int [][]dpArray){
        if(i>=0 && j>=0 && Array[i][j]==1)
            return 0;
        if(i==0 && j ==0)
            return 1;
        if(i<0 || j<0)
            return 0;
        if(dpArray[i][j]!=-1)
            return dpArray[i][j];
        int up=UniquePathWithObstacles(i-1, j, Array, dpArray);
        int left=UniquePathWithObstacles(i, j-1 , Array, dpArray);
        return dpArray[i][j]=up+left;
    }
    static int obstacles(int m , int n, int [][]array){
        int [][]dpArray=new int[m][n];
        for (int row[]:dpArray)
            Arrays.fill(row, -1);
        return UniquePathWithObstacles(m-1, n-1, array, dpArray);
    }

    public static void main(String[] args) {
        int[][] maze = { {0,0,0},
                {0,1,0},
                {0,0,0}};

        int n = maze.length;
        int m = maze.length;
        System.out.println(obstacles(m, n, maze));
    }
}
