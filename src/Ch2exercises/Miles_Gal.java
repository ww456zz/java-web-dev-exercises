package Ch2exercises;

import java.util.Scanner;

public class Miles_Gal {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter the miles has driven: ");
        Double miles = input.nextDouble();
        System.out.println("Enter the gas used: ");
        Double gas = input.nextDouble();
        Double mpg = miles/gas;
        System.out.println("Your car mpg is "+mpg+".");
    }
}
