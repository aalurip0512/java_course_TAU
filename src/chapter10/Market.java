package chapter10;

public class Market {
    public static void main(String[] args) {
    Fruit apple = new Apple();
    ((Apple) apple).removeSeeds();

    Fruit banana = new Banana();
    ((Banana) banana).peel();

    Fruit apple1= new Apple();

    apple1.getCalories();
    apple1.setCalories();
    apple1.makeJuice();
    System.out.println("This is so may"+ apple1.getCalories());
    squeeze(banana);
    squeeze(apple);
    squeeze(apple1);
    }
public static void squeeze(Fruit fruit){
    System.out.println("i love squeezing");
    fruit.makeJuice();
}

}
