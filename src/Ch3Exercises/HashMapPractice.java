package Ch3Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void GradebookHashMap() {
        Scanner input = new Scanner(System.in);
        HashMap<Object, Object> classRoster = new HashMap<>();
        String newStudent;
        do {
            System.out.print("Student: ");
            newStudent = input.nextLine();
            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);
                input.nextLine();
            }
        } while (!newStudent.equals(""));
        input.close();
        System.out.println(("\nClass roster:"));
        for (Map.Entry<Object, Object> student : classRoster.entrySet()) {
            System.out.println((student.getValue()) + "'s IF= ID: " + student.getKey());
        }
        System.out.println("Number of students in roster: " + classRoster.size());
    }

}
