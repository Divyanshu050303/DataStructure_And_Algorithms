package Question;
/*
*  Mr Raman is having two unsorted arrays with names myarr1 and myarr2. They can be of any size.
They may contain duplicate values also. Raman wants for each element in myarr1[ ] to count elements
* greater than or equal to it in array myarr2[].

Example

Imagine the size of both the arrays are 5

myarr1[]  values  {3,4,1,2,2}
myarr2[] values  {1,2,1,3,1}

Output :
1,0,5,2,2*/
class Raman
{
    int []myarr1={3,4,1,2,2};
    int []myarr2={1,2,1,3,1};
    int []output;
    public void greaterEqual()
    {
            output=new int[myarr1.length];
            int greaterEquals=0;
            for(int i=0;i<myarr1.length;i++)
            {
                for(int j=0;j<myarr1.length;j++)
                {
                    if(myarr2[j]>=myarr1[i])
                    {
                        greaterEquals+=1;
                    }
                }
                output[i]=greaterEquals;
                greaterEquals=0;
            }
        System.out.println("output :");
        for(int i=0;i<myarr1.length;i++)
        {
            System.out.print(output[i]+" ");
        }
    }

}
public class Question7
{
    public static void main(String[] args)
    {
        Raman r=new Raman();
        r.greaterEqual();
    }
}
