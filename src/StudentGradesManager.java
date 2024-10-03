import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradesManager {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add some initial data
        students.add("Alice");
        grades.add(85);
        students.add("Bob");
        grades.add(90);

        // Display students and grades
        displayStudentsAndGrades(students, grades);

        // Update a grade
        System.out.println("Enter student name to update grade:");
        String name = scanner.nextLine();
        System.out.println("Enter new grade:");
        int newGrade = scanner.nextInt();
        updateGrade(students, grades, name, newGrade);

        // Display updated list
        displayStudentsAndGrades(students, grades);

        // Calculate and display average grade
        System.out.println("Average grade: " + calculateAverageGrade(grades));
    }

    public static void displayStudentsAndGrades(ArrayList<String> students, ArrayList<Integer> grades) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i) + ": " + grades.get(i));
        }
    }

    public static void updateGrade(ArrayList<String> students, ArrayList<Integer> grades, String name, int newGrade) {
        int index = students.indexOf(name);
        if (index != -1) {
            grades.set(index, newGrade);
        } else {
            System.out.println("Student not found.");
        }
    }

    public static double calculateAverageGrade(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}
