package Arrays.matrix;

import java.util.Scanner;

class rotate{
    int [][]insertedMatrix, printableMatrix;
    int row, column;
    public void insert(){
        System.out.println("Enter number of row");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        System.out.println("Enter number of column");
        column=sc.nextInt();
        insertedMatrix=new int[row][column];
        printableMatrix=new int[row][column];
        System.out.println("Enter the element in the matrix");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                insertedMatrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Actual array is->");
        printArray(insertedMatrix);
    }
    public void printArray(int [][]matrix){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void rotate90Degree(){
        System.out.println("After the rotation of the matrix ->");
        int x=0;
        for (int i=0;i<row;i++){
            int y=0;
            for (int j=column-1;j>=0;j--){
                printableMatrix[x][y]=insertedMatrix[j][i];
                y+=1;
            }
            x+=1;
        }
        printArray(printableMatrix);
    }
}
public class rotateMatrixBy90Degree {
    public static void main(String[] args) {
        rotate r=new rotate();
        r.insert();
        r.rotate90Degree();
    }
}
