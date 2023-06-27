package Arrays.question;

import java.util.ArrayList;
import java.util.List;

public class FindKPairswithSmallestSums {
    public static void main(String[] args) {
        int []num1={1,7,11};
        int []num2={2,4,6};
        List<List<Integer>> outer =new ArrayList<>();
        List<List<Integer>> answer =new ArrayList<>();
        for(int i:num1){
            for(int j:num2){
                ArrayList<Integer>inner =new ArrayList<>();
                inner.add(i);
                inner.add(j);
                outer.add(inner);
            }
        }
         int k=3;
        System.out.println(outer.toString());
        for(int i=0;i<k;i++){
            answer.add(outer.get(i));
        }
        System.out.println(answer.toString());
    }
}
