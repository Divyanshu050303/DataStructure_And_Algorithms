package recursion;
class path{
    int c=0;
    public int ma(int row, int column )
    {
        if(row==1 && column==1)
        {
            return 0;
        }
        if(row>1){
            ma( row-1, column);
        }
        if(column>1){
            ma( row, column-1);
        }
        return c;
    }

}

public class mazePath {
    public static void main(String[] args) {
        path p=new path();
        p.ma(3, 7);
    }
}
