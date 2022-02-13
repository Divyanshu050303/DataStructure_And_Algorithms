package recursion;

class skip
{
    String StringInput, StringAnswer="";

    public skip(String stringInput) {
        StringInput = stringInput;
    }

    public String character(int size, String particularCharacter, int index)
    {
        if(index==StringInput.length())
        {
            return StringAnswer;
        }
        char str=StringInput.charAt(index);
        if(particularCharacter.equals(str))
        {
            StringAnswer+="";
        }
        else {
            StringAnswer += StringInput.charAt(index);
        }
        return character(size, "apple", index+1);
    }
}
public class skipAparticularCharacterInTheString {
    public static void main(String[] args) {
        String s="we have tqo apple one is big and one apple is small";
        skip st=new skip(s);
        System.out.println(st.character(s.length()-1, "apple", 0));

    }
}
