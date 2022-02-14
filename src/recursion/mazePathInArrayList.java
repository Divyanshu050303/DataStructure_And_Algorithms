package recursion;

import java.util.ArrayList;

class pathArrayList{
    public ArrayList<String> ma(String p, int row, int column )
    {
        if(row==1 && column==1)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> l=new ArrayList<>();
        if(row>1){
            l.addAll(ma(p+"D", row-1, column));
        }
        if(column>1){
            l.addAll(ma(p+"R", row, column-1));
        }
        return l;
    }
}
public class mazePathInArrayList {
    public static void main(String[] args) {
        pathArrayList pa=new pathArrayList();
        System.out.println(pa.ma("", 3, 3));
    }
}
