package Arrays.matrix;

import java.util.Scanner;

class search{
    int [][]matrix;
    int row, col, sear;
    public void insert(){
        System.out.println((int)Math.ceil(4.8));
        System.out.println("Enter the number of row");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        System.out.println("Enter the number of column");
        col=sc.nextInt();
        System.out.println("Enter the element in the matrix");
        matrix=new int[row][col];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the element you want to search in the matrix");
        sear=sc.nextInt();
    }
    public boolean sercj(){
        boolean t=false;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == sear){
                    t=true;
                }
            }
        }
        return t;
    }
    public void printTheMatrix(){
        System.out.println("....Matrix....");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class searching {
    public static void main(String[] args) {
        search s=new search();
        s.insert();
        System.out.println(s.sercj());

    }
}
