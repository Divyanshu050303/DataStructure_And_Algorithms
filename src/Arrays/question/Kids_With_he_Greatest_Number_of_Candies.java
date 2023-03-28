package Arrays.question;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_he_Greatest_Number_of_Candies {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        ArrayList<Boolean> ar=new ArrayList<>();
        int min=c[0];
        for(int i=0;i<c.length;i++){
            if(c[i]>min){
                min=c[i];
            }
        }
        for(int i=0;i<c.length;i++){
            int n=c[i]+e;
            if(n<min){
                ar.add(false);
            }
            else{
                ar.add(true);
            }
        }
        return ar;

    }
}
