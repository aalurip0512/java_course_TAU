package chapter3;

import java.util.Scanner;

/*

*/
public class SalaryCalculator {

    public static void main(String args[]){
        //initialize the known values

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //get what i don't know
        System.out.println("How many sales did you do");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // Quick detour for the bonus earners
        if(sales>quota){
            salary = salary+bonus;
        }
        //calculation output
        System.out.println("Your Salary is $" + salary);
    }
}
