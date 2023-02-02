package Arrays.question;

import java.util.ArrayList;

public class subArrayWithSum {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int s=15;
        int n=10;
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<n;i++){
            int sum=arr[i];
            if(sum==s){
                arrayList.add(i+1);
                System.out.println(arrayList);
                return;
            }
            else{
                for(int j=i+1;j<n;j++){
                    sum+=arr[j];
                    if(sum==s){
                        arrayList.add(i+1);
                        arrayList.add(j+1);
                        System.out.println(arrayList);
                        return;
                    }
                }
            }
        }
        arrayList.add(-1);
        System.out.println(arrayList);

    }
}
