package Arrays;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    static void permute(int []nums, List<Integer> ds, List<List<Integer>> and, boolean []fre){
        if(ds.size()==nums.length) {
            and.add(new ArrayList<>(ds));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if(!fre[i]){
                fre[i]=true;
                ds.add(nums[i]);
                permute(nums, ds, and, fre);
                ds.remove(ds.size()-1);
                fre[i]=false;
            }
        }
    }
   static List<List<Integer>> ppremut(int []arr){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        boolean fre[]=new boolean[arr.length];
        permute(arr, ds, ans, fre);
        return ans;
    }

    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println(ppremut(arr));
    }
}
