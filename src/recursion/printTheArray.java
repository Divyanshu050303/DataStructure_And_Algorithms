package recursion;
class time{
    public void print(int []array, int n){
        if(n>array.length-1){
            return;
        }
        System.out.println(array[n]);
        print(array, n+1);
    }
}
public class printTheArray {
    public static void main(String[] args) {
        int []array={1, 2,3, 4,5 ,5, 6};
        time t=new time();
        t.print(array, 0);
    }
}
