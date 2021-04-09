package chapter4;

import java.util.Random;
import java.util.Scanner;

public class RollTheDice {
    public static void main (String arg[]) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();
        System.out.println("welcome to Roll die game.. let's begin");

        for(int i = 1; i <=maxRolls; i++){
            int die = random.nextInt(6)+1;
            currentSpace = currentSpace+die;
            System.out.println(String.format("Roll #%d: You've rolled a %d", i, die));

            if(currentSpace == lastSpace){
                System.out.println("you are on "+currentSpace+". Congratulations you won");
                break;
            }
            else if (currentSpace>lastSpace){
                System.out.println("You are past the "+ lastSpace+". You loose !!");
                break;
            }
            else   {
                int spacesToGo = lastSpace -currentSpace;
                System.out.println("You are at this "+ spacesToGo + " Try again");
            }
            System.out.println();
        }




    }
}
