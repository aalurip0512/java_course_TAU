package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String args[]){

        //What i know

        int quota = 10;

        //What i dont know
        System.out.println("How many sales did you do");
        Scanner scanner =new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        //Decision and outputs
        if (sales>quota){
            System.out.println("you did it");

        }
        else{
            int salesShort = quota - sales;
            System.out.println("you did not make it and you are less "+ salesShort);
        }

    }
}
