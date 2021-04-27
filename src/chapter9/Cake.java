package chapter9;

public class Cake {
    public String flavour;
    public double price;

    public Cake(String flavour) {
        setFlavour(flavour);
        setPrice(9.99);
    }

    public Cake() {

    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
