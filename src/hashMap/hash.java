package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class hash {
    public static void main(String[] args) {
//        String s="Divyanshu";
//
//
//        HashMap<Character, Integer> h=new HashMap<>();
//        for (int i = 0; i <s.length() ; i++) {
//            char c=s.charAt(i);
//            if(h.containsKey(c)){
//               h.put(c, h.get(c)+1);
//            }
//            else {
//                h.put(c,1);
//            }
//        }
//        System.out.println(h);
        HashSet<Integer> set=new HashSet<>();
        int []arr={2, 1, 4, 3, 5, 7, 6, 5};
        List<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if(set.contains(arr[i])){
                arrayList.add(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
        System.out.println(set);
        // write a program to count the number of node in the binary tree
    }
}
