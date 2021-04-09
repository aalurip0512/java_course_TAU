package chapter5;

import java.util.Scanner;

public class CellPhoneBill {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base cost of the plan");
        double baseCost= scanner.nextDouble();

        System.out.println("Enter the overage minutes");
        double overageMinutes = scanner.nextDouble();
        scanner.close();
        double overageCharge = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost+overageCharge);
        calculateAnPrintTheBill(baseCost,overageMinutes,tax);


    }
    public static double calculateOverages(double extraMinutes){
        double rate = .25;
        double overage = extraMinutes*rate;
        return overage;
        }
    public static double calculateTax(double subTotal){
        double rate = .15;
        double tax = subTotal*rate;
        return tax;
    }
    public static void calculateAnPrintTheBill(double base, double overage, double tax){
        double finalTotal = base+overage+tax;
        System.out.println("Your Phone Bill Statement:");
        System.out.println("Plan: $"+String.format("%.2f",base));
        System.out.println("overage: $"+String.format("%.2f",overage));
        System.out.println("Tax: $"+String.format("%.2f",tax));
        System.out.println("Final Total: $"+String.format("%.2f",finalTotal));
    }

}
