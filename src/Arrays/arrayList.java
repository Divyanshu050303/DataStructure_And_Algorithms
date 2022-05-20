package Arrays;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(15);
        for (int i = 0; i <4; i++) {
            a.add(a.get(i));

        }
        System.out.println(a);
        for (int i = 4; i <a.size() ; i++) {
            b.add(a.get(i));
        }
        System.out.println(b);

        System.out.println(a);
    }
}
