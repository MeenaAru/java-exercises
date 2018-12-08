package excercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
        public static void main(String[] args) {

            HashMap<Integer, String> students = new HashMap<>();
            Scanner in = new Scanner(System.in);
            String newStudent;

            System.out.println("Enter your students (or ENTER to finish):");

            // Get student names
            int id = 0;
            do {

                System.out.print("Student: ");
                newStudent = in.nextLine();
                id = id + 1;
                if (!newStudent.equals("")) {
                    students.put(id,newStudent);

                    // Read in the newline before looping back
                    in.nextLine();
                }

            } while(!newStudent.equals(""));

            // Print class roster
            System.out.println("\nClass roster:");

            for (Map.Entry<Integer, String> student : students.entrySet()) {
                System.out.println(student.getKey() + " (" + student.getValue() + ")");
            }
        }

    }
