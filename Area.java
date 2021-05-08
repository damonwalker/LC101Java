package org.launchcode.java.studios.areaofacircle.studios;
import java.util.Scanner;
public class Area {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle: ");
        double r = input.nextDouble();
        while (r < 0){
            System.out.println("Please enter a valid number");
            r = input.nextDouble();
        }
        double area = 1;
        //double area = 3.14 * r * r;
        //Circle.getArea(r);
        System.out.println("The area of a circle of radius " + r + " is: " + Circle.getArea(r));

    }
}
