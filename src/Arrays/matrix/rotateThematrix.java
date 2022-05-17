package Arrays.matrix;

import java.util.Scanner;

class rotate1{
    int [][]array;
    int [][]array2;
    int size, row, column, k;
    public void insert(){
        System.out.println("Enter the number of rows");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        System.out.println("Enter the number of column");
        column=sc.nextInt();
        array=new int[row][column];
        System.out.println("Enter the element in the matrix");
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("How many  time do you want to shift");
        k=sc.nextInt();
        System.out.println("Actual matrix");
        traverse();
        rotate(k);

    }
    public void traverse(){
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void rotate(int k){
        int n=0;
        int temp=array[row-1][column-1];
        int temp1=array[0][0];
        for (int i = row-1; i >0 ; i--) {
            for (int j = column-1; j >0 ; j--) {
                array[i][j]=array[i][j-1];


            }
            array[i][0]=array[i-1][row-1];
            if(n==k){
                break;
            }
            n+=1;

        }
        array[0][0]=temp;
//        array[row-1][column-1]=temp1;
        System.out.println("After the operation");
        traverse();
    }
}
public class rotateThematrix {
    public static void main(String[] args) {
        rotate1 r=new rotate1();
        r.insert();

    }
}
