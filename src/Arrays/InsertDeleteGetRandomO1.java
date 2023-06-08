package Arrays;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class InsertDeleteGetRandomO1 {
    Set<Integer> array;

    public void RandomizedSet() {
        array=new HashSet<>();
    }

    public boolean insert(int val) {
        if(!(array.contains(val))){
            array.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if(array.contains(val)){
            array.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        Integer[] arr = array.toArray(new Integer[array.size()]);
        Random random=new Random();
        int number =random.nextInt(array.size());
        return arr[number];
    }
}
