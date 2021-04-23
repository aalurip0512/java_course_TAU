package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
        double area = calculator.calculatorTotalArea(kitchen, bathroom);

        System.out.println("The total area is: " + area);

        calculator.scanner.close();
    }

    public Rectangle getRoom(){


        System.out.println("Enter the the lenght of the room");
        double length= scanner.nextDouble();

        System.out.println("Enter the the width of the room");
        double width= scanner.nextDouble();


        return new Rectangle(length,width);
    }

    public double calculatorTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea()+ rectangle2.calculateArea();
    }
}
