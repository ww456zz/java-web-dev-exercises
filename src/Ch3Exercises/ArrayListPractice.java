package Ch3Exercises;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
    int arr[] = {1,2,3,5,6,9,10,22,55,24};
    }

    public static int addEven(ArrayList<Integer> arr) {
        int sum = 0;
        for (int item:arr) {
            if (item % 2 == 0 ) {
                sum +=item;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void printLetters(String[] list) {
        ArrayList<String> list1= new ArrayList<>();
        //int i = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();
        for (String words:list1) {

            if(words.length() >= numChars) {
                System.out.println(words);
            }
        }
        input.close();
    }

}
