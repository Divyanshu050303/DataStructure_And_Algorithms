package Question;
import java.util.Scanner;
/*
Write a Java class, Flower, that has three instance variables of type String, int, and float, which respectively
represent the name of the flower, its number of petals, and price. Your class must include a constructor method that
initialises each variable to an appropriate value, and your class should include methods for setting the value of each
type, and getting the value of each type.
Create an array of 5 Flower objects and print the value.
 */
class flower
{
    String name;
    int numberOfPetals;
    float price;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    flower(String n, int pe, float p )
    {
        name=n;
        numberOfPetals=pe;
        price=p;
    }
    public String toString(){
        return "Name of flower is "+name+" Number of Petals are "+numberOfPetals+" and the Price is "+price;
    }
}
public class Question6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int numberOfFlower =5;
     flower [] flowers=new flower[numberOfFlower];
     for(int i=0;i<numberOfFlower;i++){
         String n=sc.next();
         int num=sc.nextInt();
         float pr=sc.nextFloat();
         flowers[i]=new flower(n, num, pr);
     }
     for(flower flowe:flowers){
         System.out.println(flowe);
     }
    }
}
