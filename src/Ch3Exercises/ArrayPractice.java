package Ch3Exercises;

public class ArrayPractice {
    public static void main(String[] args) {
        int array[] = {1, 1, 2, 3, 5, 8};
        for (int each : array) {
            if (each%2!=0)
            System.out.println(each);
        }
    }
}
