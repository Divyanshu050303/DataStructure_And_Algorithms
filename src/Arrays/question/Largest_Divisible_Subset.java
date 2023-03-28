package Arrays.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Largest_Divisible_Subset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> l=new ArrayList<>();
        if(nums==null || nums.length==0){
            return l;
        }
        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(nums);
        for(int n:nums){
            arr.add(new ArrayList<>());
        }
        for(int i=0;i<nums.length;i++){
            List<Integer> max=new ArrayList<>();
            for(int k=0;k<i;k++){

                if(nums[i]%nums[k]==0 && max.size()<arr.get(k).size()){
                    max=arr.get(k);
                }
            }
            arr.get(i).addAll(max);
            arr.get(i).add(nums[i]);
        }
        for(int i=0;i<arr.size();i++){
            if(l.size()<arr.get(i).size()){
                l=arr.get(i);
            }
        }

        return l;
    }
}
