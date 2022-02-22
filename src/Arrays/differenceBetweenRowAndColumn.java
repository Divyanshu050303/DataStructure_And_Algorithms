package Arrays;
import java.util.Scanner;
public class differenceBetweenRowAndColumn {
    public static void main(String[] args) {
        int [][]arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++) {
            int columnSum=0, rowSum=0;
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
                 columnSum+=arr[j][i];
                 rowSum+=arr[i][j];
            }
            System.out.println("Difference between row and column..."+(rowSum-columnSum));
        }
    }
}
