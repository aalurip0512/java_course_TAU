package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main (String arg[]){
        Scanner scanner = new Scanner(System.in);
        boolean again =false;

        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();
            double sum = num1+num2;
            System.out.println(sum);
            System.out.println("would you liek to start over");
            again = scanner.nextBoolean();
        }while(again);


        int rate = 15;
        int maxHours= 40;


}}

