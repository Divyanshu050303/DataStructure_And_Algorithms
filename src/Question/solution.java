package Question;
import java.util.*;

public class solution {

    private static String getRuler(String kingdom) {
        char c=kingdom.charAt(kingdom.length()-1);
        String ruler = "";
        String checkFor = "AEIOUaeiou";
        if(checkFor.contains("" + c)) {
            ruler+="Alice";
        }
        else
        {
            if(c=='y' || c=='Y'){

                ruler+="nobody";
            }
            else {
                ruler += "Bob";
            }
        }

        return ruler;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();

            for (int t = 1; t <= T; t++) {
                String kingdom = in.next();
                System.out.println(
                        "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
            }
        }
    }
}
