package Ch2exercises;

import java.util.Scanner;

public class RectangleCalculation {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rectangle's length: ");
        Double length = input.nextDouble();
        System.out.println("Enter the rectangle's width: ");
        Double width = input.nextDouble();
        Double area = length*width;
        System.out.println("The rectangle's area is "+area+" units.");
    }
}

