package hashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class element {
    public static void main(String[] args) {
        int []arr={6 ,1 ,15, 19, 9 ,13 ,12, 6 ,7 ,2 ,10, 4 ,1 ,14, 11, 14, 14, 13};
        HashMap<Integer, Integer>map1=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(!map1.containsKey(arr[i])){
                map1.put(arr[i],1);
            }
            else {
                map1.put(arr[i], map1.get(arr[i])+1);
            }
        }
        int maxValueInMap = (Collections.max(map1.values()));
        if(maxValueInMap>arr.length/2){
            for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
                if (entry.getValue() ==maxValueInMap  ) {
                    System.out.println(entry.getValue());
                }
            }

        }
        else {
            System.out.println(-1);
        }

        Map<Integer,Integer> map =new HashMap<>();
        int count=1,k= arr.length/2;
        for(int number : arr){
            int temp;
            if(map.containsKey(number)){
                temp=map.get(number);
                map.put(number,++temp);
            }else{
                map.put(number,count);
            }
        }
        int max = (Collections.max(map.values()));

        if(max>k){
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == max) {
                    System.out.println(entry.getKey());
                }
            }
        }

        else{
            System.out.println(-1);
        }

    }
}
