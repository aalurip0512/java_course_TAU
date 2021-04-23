package chapter6;

public class PhoneBill {
    int id;
    double baseCost;
    double minutesAlloted;
    double minutesused;

    public PhoneBill() {
        id = 0;
        baseCost = 79.99;
        minutesAlloted = 800;
        minutesused = 800;
    }

    public PhoneBill(int id) {
        this.id = id;
        baseCost = 79.99;
        minutesAlloted = 800;
        minutesused = 800;
    }

    public PhoneBill(int id, double baseCost, double minutesAlloted, double minutesused) {
        this.id = id;
        this.baseCost = baseCost;
        this.minutesAlloted = minutesAlloted;
        this.minutesused = minutesused;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;

    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost() {
        this.baseCost = baseCost;
    }

    public double getMinutesAlloted() {
        return minutesAlloted;
    }

    public void setMinutesAlloted() {
        this.minutesAlloted = minutesAlloted;
    }
    public double getMinutesused() {
        return minutesused;
    }

    public void setMinutesused() {
        this.minutesused = minutesused;
    }
    public void setMinutesUsed(int minutes){
        minutesused = minutes;
    }

    public double calculateOverage(){
        if(minutesused <= minutesAlloted){
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = minutesused - minutesAlloted;
        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }
}

