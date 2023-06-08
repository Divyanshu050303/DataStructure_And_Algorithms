package Arrays;

public class IntegertoRoman {
    // String roman="";
    // int[] number={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    // String[] Roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    // for(int i=0;i<number.length;i++){
    //     while(num>=number[i]){
    //         roman+=Roman[i];
    //         num-=number[i];
    //     }
    // }
    // return roman;
    String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    String hrns[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    String ths[]={"","M","MM","MMM"};

//    return ths[num/1000] + hrns[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];
}
