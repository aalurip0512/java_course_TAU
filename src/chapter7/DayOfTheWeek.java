package chapter7;

import java.util.Random;
import java.util.Scanner;


public class DayOfTheWeek {
       public static void main(String args[]) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day of the week");
   //     Scanner input = null;
        int index = input.nextInt();
        input.close();
        System.out.println("Corresponding day: " + week[index - 1]);


    }
}