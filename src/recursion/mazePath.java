package recursion;
class path{
    public void ma(String p,int row, int column )
    {
        if(row==1 && column==1)
        {
            System.out.println(p);
            return;
        }
        if(row>1){
            ma(p+"D", row-1, column);
        }
        if(column>1){
            ma(p+"R", row, column-1);
        }
    }
}

public class mazePath {
    public static void main(String[] args) {
        path p=new path();
        p.ma("", 3, 3);
    }
}
