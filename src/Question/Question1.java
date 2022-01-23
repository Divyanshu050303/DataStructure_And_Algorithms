package Question;
import java.util.Scanner;
/*There is a company that manufactures three types of products. In this company, there are 5 salesmen.
 Each salesman is supposed to sell three products. Write a program to print

        (i) The total no of sales by each salesman and

        (ii) total sales of each item.*/
class company
{
    int []product;
    final static int numberOfProduct=3;
    company()
    {
        product=new int[numberOfProduct];
    }
    public void getSales(int...salesOfProduct)
    {
        product=salesOfProduct;
    }
    public int totalSalesByTheSalesman()
    {
        int sum=0;
        for(int i:this.product)
           sum+=i;
        return sum;
    }
    public static int itemWiseTotalSales( company[] salesmenArray, int item)
    {
        int totalSales=0;
        for(company i:salesmenArray)
        {
            try
            {
                totalSales+=i.product[item] ;
            }
            catch (IndexOutOfBoundsException e)
            {
                 totalSales+=0;
            }
        }
        return totalSales;
    }


}
public class Question1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        company [] salesman;
        salesman=new company[5];

        for(int i=0;i<salesman.length;i++)
        {
            System.out.println("Enter the sales data for salesman "+(i+1)+" : ");
            salesman[i]=new company();
            salesman[i].getSales(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        for(int i=0;i< salesman.length;i++)
        {
            System.out.println("Total Sales By Salesman "+(i+1)+" ="+ salesman[i].totalSalesByTheSalesman());
        }
        for(int i=0;i<company.numberOfProduct;i++)
        {
            System.out.println("Total sales of item "+(i+1) +" = "+company.itemWiseTotalSales(salesman, i));
        }
    }
}
