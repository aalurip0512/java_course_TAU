package chapter4;

import java.util.Scanner;

public class Cashier {
    public static void main (String arg[]) {

     System.out.println("Enter the number of items");
     Scanner scanner = new Scanner(System.in);
     int quantity = scanner.nextInt();
     scanner.close();

     double total = 0;
     for (int i=0;i<quantity;i++){
         System.out.println("Enter cost of the items");
         double price = scanner.nextDouble();
         total = total+price;
     }
     scanner.close();
        System.out.println(total);
    }
}
