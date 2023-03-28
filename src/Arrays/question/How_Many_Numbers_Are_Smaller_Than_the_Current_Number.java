package Arrays.question;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int c=0, max=nums[i];
            for(int j=0;j<nums.length;j++){
                if(max>nums[j] && j!=i){
                    c++;
                }
            }
            arr[i]=c;
        }
        return arr;

    }
}
