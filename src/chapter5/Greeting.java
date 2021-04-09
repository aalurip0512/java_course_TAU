package chapter5;

import java.util.Scanner;

public class Greeting {
    public static void main(String args[]){
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetingUser((name));
    }

    public static void greetingUser(String name){
        System.out.println("hi " + name);
    }
}
