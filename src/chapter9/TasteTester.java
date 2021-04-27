package chapter9;

public class TasteTester {
    public static void main (String[] args){
        Cake cake = new Cake("Choco");
        cake.setPrice(29.99);
        System.out.println("Cake Flavour is :" + cake.getFlavour());
        System.out.println("Cake Price is :" + cake.getPrice());

        BirthDayCake birthDayCake = new BirthDayCake();
        birthDayCake.setFlavour("Sexy");
        birthDayCake.setPrice(49.95);
        System.out.println("Cake Flavour is :" + birthDayCake.getFlavour());
        System.out.println("Cake Price is :" + birthDayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavour("Pina Coloda");
        System.out.println("Cake Flavour is :" + weddingCake.getFlavour());

    }


}
