package chapter13;

public class DivisonIsFun {
    public static void main(String[] args) {
        division();
    }

    public static void division() {
        try{
            int c= 30/0;
        }catch(Exception e){
            System.out.println("Division by zero is not permitted");
        }finally {
            System.out.println("Division is fun");
        }

    }
}
