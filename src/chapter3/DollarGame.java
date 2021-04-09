package chapter3;

import java.util.Scanner;

public class DollarGame {

    public static void main(String args[]){

       // int pennies =1 ;
        int nickle =5 ;
        int dime =10 ;
        int quarter = 25;
        int oneDollar = 100;
        System.out.println("Enter no.of Pennies");
        Scanner scanner = new Scanner(System.in);
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter no.of nickles");
        int numOfNickles = scanner.nextInt();

        System.out.println("Enter no.of dimes");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter no.of quarters");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        int totalEnteredMoney = (numOfPennies+(nickle*numOfNickles)+(dime*numOfDimes)+(quarter*numOfQuarters));

        if (totalEnteredMoney>oneDollar) {
            totalEnteredMoney = (totalEnteredMoney-oneDollar);
            System.out.println("You lost the game. Entered more by cents:"+totalEnteredMoney);
        }
        else if (totalEnteredMoney < oneDollar){
            totalEnteredMoney = (oneDollar-totalEnteredMoney);
            System.out.println("You lost the game. Entered less by cents:"+totalEnteredMoney);
            }
        else
            System.out.println("You won the game.");
        }
    }
