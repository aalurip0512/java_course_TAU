package chapter2;

import java.util.Scanner;

public class CoffeeCheck {
    public static void main(String args[]){

        //What is the season fo the year
        System.out.println("What is the season fo the year");
        Scanner scanner = new Scanner(System.in);
        String seasonOfTheYear = scanner.next();

        // Whole number
        System.out.println("No. of cups of coffee you drink?");
        int noOfCups = scanner.nextInt();

        // Adjective
        System.out.println("How do you feel about this season");
        String adjectiveSeason= scanner.next();
        scanner.close();

        System.out.println("On this "+ adjectiveSeason+ " "+seasonOfTheYear + " day, "+ "I drink a minimum of "+ noOfCups + " " +"cups of coffee");

    }
}
