package string;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    private void solve(String s, List<String> arr, int index){
        if(index>=s.length()){
            arr.add(s);
            return;
        }
        for(int i=index;i<s.length();i++){
            char t=s.charAt(index);
            s.replace(s.charAt(index),s.charAt(i));
            s.replace(s.charAt(i),t);
            solve(s, arr, index+1);
            char t1=s.charAt(index);
            s.replace(s.charAt(index),s.charAt(i));
            s.replace(s.charAt(i),t1);
        }
    }
    public static void main(String[] args) {
        List<String> array=new ArrayList<>();

//        solve(S, array, 0);
    }
}
