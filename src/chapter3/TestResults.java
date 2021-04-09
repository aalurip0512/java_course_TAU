package chapter3;

import java.util.Scanner;

public class TestResults {

    public static void main(String args[]) {

        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score= scanner.nextDouble();
        char grade;

        if (score<60){
            grade = 'f';
        }
        else if (score <70){
            grade = 'd';
        }
        else if (score <80){
            grade = 'c';
        }
        else if (score <90){
            grade = 'b';
        }
        else{
            grade = 'a';
        }

        System.out.println(grade);
    }
}