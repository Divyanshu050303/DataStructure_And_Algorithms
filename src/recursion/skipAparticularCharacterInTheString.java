package recursion;

class skip
{
    String StringInput, StringAnswer="";

    public skip(String stringInput) {
        StringInput = stringInput;
    }

    public String character(int size, char particularCharacter, int index)
    {
        if(index==StringInput.length())
        {
            return StringAnswer;
        }
        char str=StringInput.charAt(index);
        if(particularCharacter==str)
        {
            StringAnswer+="";
        }
        else {
            StringAnswer += StringInput.charAt(index);
        }
        return character(size, 'a', index+1);
    }
}
public class skipAparticularCharacterInTheString {
    public static void main(String[] args) {
        String s="baccad";
        skip st=new skip(s);
        System.out.println(st.character(s.length()-1, 'a', 0));

    }
}
