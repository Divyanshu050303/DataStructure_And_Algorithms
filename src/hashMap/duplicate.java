package hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class duplicate {
    public static void main(String[] args) {
        int []arr={2,3,1};
        ArrayList<Integer> arrayList=new ArrayList<>();
        HashMap<Integer, Integer> map1=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(!map1.containsKey(arr[i])){
                map1.put(arr[i],1);
            }
            else {
                map1.put(arr[i], map1.get(arr[i])+1);
            }
        }

            for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
                if (entry.getValue() >1  ) {
                    arrayList.add(entry.getKey());
                }
        }
            if(arrayList.size()>=1){
                System.out.println(arrayList);
            }
            else {
                System.out.println(-1);
            }

    }
}
