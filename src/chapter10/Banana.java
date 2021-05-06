package chapter10;

public class Banana extends Fruit{
    public void peel(){
        System.out.println("peel the banana");
    }
    public Banana(){
        setCalories(100);
    }
    @Override
    public void makeJuice(){
        System.out.println("i like my banana shake");
    }
}
