package Arrays.question;

import java.util.ArrayList;
import java.util.Collections;

public class maximumIndex {
    public static void main(String[] args) {
        int n=9;
        int []arr={34, 8, 10, 3, 2, 80, 30, 33, 1};
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<n;i++){
            arrayList.add(arr[i]);
        }
        int max= Collections.max(arrayList);
        int index=arrayList.indexOf(max);
        System.out.println(index+1);
    }
}
