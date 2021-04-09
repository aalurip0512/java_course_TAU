package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main (String arg[]){


       int rate = 15;
       int maxHours= 40;

        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked>maxHours || hoursWorked<1) {

            System.out.println("invalid entry , your work must be in 1 to 40. Try again");
            hoursWorked=scanner.nextDouble();

        }
        scanner.close();
        double gross = hoursWorked*rate;
        System.out.println(gross);

    }



}
