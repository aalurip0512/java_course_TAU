package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String arg[]){
        //get the number of hours worked

       System.out.println(" Enter the number of hours employee worked");
       Scanner scanner = new Scanner(System.in);
       int hours = scanner.nextInt();
       // get the hourly pay
       System.out.println(" Enter the hourly pay");
       double rate =scanner.nextDouble();
       scanner.close();
        // multiply the hours and pay rate
        double grossPay = hours*rate;
        // Display the result         *
        System.out.println("Employee Gross pay is $" + grossPay);
    }



}
