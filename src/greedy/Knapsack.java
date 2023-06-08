package greedy;

import java.util.Arrays;

public class Knapsack {
    void greedy_Knapsack(int []p, int []w,int weight){
        double []avgpw=new double[p.length];
        for(int i=0;i<p.length;i++){
            avgpw[i]=(double)p[i]/w[i];
        }
        
        double []collection=new double[p.length];
        int i;
        for ( i = 0; i < p.length; i++) {
            if(w[i]>weight){
                break;
            }
            collection[i]=1.0;
            weight-=w[i];
        }
        if(i<p.length){
            collection[i]=(double) weight/w[i];
        }
        System.out.println(Arrays.toString(collection));
    }

    public static void main(String[] args) {
        int []profit={60,100,120};
        int []weight={10,20,30};
        Knapsack k=new Knapsack();
        k.greedy_Knapsack(profit, weight, 50);
    }
}
