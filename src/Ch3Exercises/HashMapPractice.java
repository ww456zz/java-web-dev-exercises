package Ch3Exercises;

import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    @Override
    public int hashCode() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.pout(newID, newStudent);
                input.nextLine();
            }
        } while (!newstudent.equals(""));
        input.close();
        System.out.println(("\nClass roster:"));
        for (Map.Entry<Integer, String> student:classRoster.entrySet()) {
            System.out.println((student.getValue()) + "'s IF= ID: "+ student.getKey());
        }
        System.out.println("Number of students in roster: " + classRoster.size());
    }
}
