package Arrays.matrix;

import java.util.Scanner;

class degree{
    int [][]insertMatrix;
    int row, column;
    public void insert(){
        System.out.println("Enter number of row");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        System.out.println("Enter number of column");
        column=sc.nextInt();
        System.out.println("Enter the element in the matrix");
        insertMatrix=new int[row][column];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                insertMatrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Actual matrix is ->");
        printTheMatrix(insertMatrix);
        rotate();
    }
    public void printTheMatrix(int [][]inserMatrix){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.print(inserMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void rotate(){
        for (int i = 0; i <row/2 ; i++) {
            for (int j=i;j<row-i-1;j++){
                int temp=insertMatrix[i][j];
                insertMatrix[i][j]=insertMatrix[row-1-j][i];
                insertMatrix[row-1-j][i]=insertMatrix[row-1-i][row-1-j];
                insertMatrix[row-1-i][row-1-j]=insertMatrix[j][row-1-i];
                insertMatrix[j][row-1-i]=temp;
            }
        }
        System.out.println("After the 90 degree rotation->");
        printTheMatrix(insertMatrix);
    }
}
public class rotateTheMatrix90Degree {
    public static void main(String[] args) {
        degree d=new degree();
        d.insert();

    }
}
