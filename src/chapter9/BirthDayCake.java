package chapter9;

public class BirthDayCake extends Cake{
    public int candles;

    public BirthDayCake(String flavour) {
        super(flavour);
    }

    public BirthDayCake() {
        super();
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }



}
