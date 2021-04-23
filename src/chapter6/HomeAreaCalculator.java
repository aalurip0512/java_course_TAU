package chapter6;

import java.awt.*;

public class HomeAreaCalculator {
    public static void main(String args[]){
        /**
         * Rectangle
         */

         //Create instance of rectangle

        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        /**
         * Rectangle - 2
         */

        //Create instance of rectangle
        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room1.calculateArea();

        double totalArea = areaOfRoom1+areaOfRoom2;
        System.out.println(totalArea);
    }
}
