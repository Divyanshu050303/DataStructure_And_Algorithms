package recursion;
class ma {
    public int count(int row, int column)
    {
        if(row==1 || column==1)
        {
            return 1;
        }
        int left=count(row-1, column);
        int right=count(row, column-1);
        return left+right;
    }
}
public class maze {
    public static void main(String[] args) {
        ma m=new ma();
        System.out.println( m.count(3, 3));

    }
}
