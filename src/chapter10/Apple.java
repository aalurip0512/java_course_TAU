package chapter10;

public class Apple extends Fruit{

    public void removeSeeds(){
        System.out.println("Remove Seeds");
    }
    public Apple(){
        setCalories(95);
    }
    @Override
    public void makeJuice(){
        System.out.println("Apple juice is my favorite 🥃");
    }

}
