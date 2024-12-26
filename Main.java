// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter university name: ");
        String universityName = scanner.nextLine();
        System.out.print("Enter location: ");
        String location = scanner.nextLine();
        University university = new University(universityName, location);

        System.out.print("How many courses do you want to add? ");
        int courseCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < courseCount; i++) {
            System.out.print("Enter course name: ");
            String courseName = scanner.nextLine();
            System.out.print("Enter course code: ");
            String courseCode = scanner.nextLine();
            System.out.print("Enter credits: ");
            int credits = scanner.nextInt();
            scanner.nextLine();
            university.addCourse(new Course(courseName, courseCode, credits));
        }

        System.out.print("How many professors do you want to add? ");
        int professorCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < professorCount; i++) {
            System.out.print("Enter professor name: ");
            String professorName = scanner.nextLine();
            System.out.print("Enter department: ");
            String department = scanner.nextLine();
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            university.addProfessor(new Professor(professorName, department, email));
        }

        System.out.println(university);

        for (Course course : university.getCourses()) {
            System.out.println(course);
        }

        for (Professor professor : university.getProfessors()) {
            System.out.println(professor);
        }
    }
}
