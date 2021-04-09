package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String args[]){
        //What i know
            int reqSalary = 30000;
            int reqYears = 2;

        //What i dont know
        System.out.println("Enter your Salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("no of years at current job");
        double noOfyears = scanner.nextDouble();
        scanner.close();
        //Decision and outputs
       if(salary>=reqSalary && noOfyears>=reqYears){
           System.out.println("You are qualifed for loan");
           }

       else {
           System.out.println("you have to make atleast "+ reqSalary);
       }
    }
}
