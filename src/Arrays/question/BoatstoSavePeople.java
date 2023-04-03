package Arrays.question;
import java.util.Arrays;
public class BoatstoSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int bc = 0;
        int left = 0, right = people.length - 1;
        Arrays.sort(people);
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                right--;
            }
            bc++;
        }
        return bc;
    }
}
