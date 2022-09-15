package Ch3Exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arr = sentence.split("\\.");
        System.out.println(Arrays.toString(arr));
    }
}
