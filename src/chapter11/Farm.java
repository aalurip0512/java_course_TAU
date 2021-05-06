package chapter11;

public class Farm {
    public static void main(String[] args) {
        Animal donald = new Animal();
            donald.makeSound();


        Duck daffy = new Duck();
        daffy.makeSound();

        Pig porky = new Pig();
        porky.makeSound();

    }

    private static class Animal {
        public void makeSound() {
        }
    }
}
