package Sorting.array;


import java.util.Arrays;

class radix{
    public void countingSort(int[]arr, int e){
        int n=arr.length;
        int []b=new int[n];
        int []count=new int[10];
        Arrays.fill(count,0);
        for (int j : arr) {
            int in = j / e;
            count[in % 10] += 1;
        }
        for (int i = 1; i <10 ; i++) {
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int index=arr[i]/e;
            b[count[index%10]-1]=arr[i];
            count[index%10]-=1;
        }
        System.arraycopy(b, 0, arr, 0, n);

    }
    public void radixSort(int []arr){
        int max=maxvalue(arr);
        for (int i = 1; max/i>0 ; i*=10) {
            countingSort(arr,i);
        }
    }
    public int maxvalue(int []arr){
        int max=arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(max);
        return max;
    }
}
public class radixsort {
    public static void main(String[] args) {
        radix n=new radix();
        int []arr={170, 45, 75, 96, 802, 24, 2, 66};
        n.radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
