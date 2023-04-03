package Sorting.array.QUESTION;
import java.util.Arrays;
public class SuccessfulPairsofSpellsandPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int [] result = new int[spells.length];
        int potionsLength = potions.length;
        Arrays.sort(potions);

        for(int i=0; i<spells.length; i++){
            int minIndex = binarySearch(potions, success, spells[i]);
            result[i] = potionsLength - minIndex;
        }
        return result;

    }

    private int binarySearch(int [] potions, long success, int spell){
        int left= 0;
        int right= potions.length;

        while(left<right){
            int mid = left + (right-left)/2;
            long product = ((long) spell) * potions[mid];
            if(product<success){
                left=mid+1;
            }else{
                right=mid;
            }
        }

        return left;
    }
}
