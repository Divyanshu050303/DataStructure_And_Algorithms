package Arrays;

import java.util.List;
import java.util.ArrayList;

class set
{
    public  List<List<Integer>> sub(int []arr)
    {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:arr) {
            int size=outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
public class subSet {
    public static void main(String[] args) {
        set s=new set();
        int []a={1, 2,3};
        List<List<Integer>> ans=s.sub(a);
        for (List<Integer> list:ans) {
            System.out.println(list);

        }
    }
}
