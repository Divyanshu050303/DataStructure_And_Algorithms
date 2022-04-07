package Arrays.matrix;

import java.util.Scanner;

class sort{
    int [][]matrix;
    int row, col;
    public void insert(){
        System.out.println("Enter the number of row");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        System.out.println("Enter the number of column ");
        col=sc.nextInt();
        System.out.println("Enter the element in the matrix");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }
    }
    public void traversal(){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <j ; j++) {
                System.out.print(matrix[i][j]);
            }
        }
    }
    public void sortTheMatrixI(){

    }
}
public class sortTheMatrix {

}

