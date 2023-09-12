import admission.StudentDetails;
import admission.Library;
import education.Assignment;
import education.Examination;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Admission Package
        StudentDetails student = new StudentDetails();
        student.inputDetails();
        System.out.println("Student Details:");
        student.display();

        Library library = new Library();
        library.inputBookDetails();
        System.out.println("Library Details:");
        library.display();

        // Education Package
        Assignment assignment = new Assignment();
        assignment.inputAssignmentDetails();
        System.out.println("Assignment Details:");
        assignment.display();

        Examination examination = new Examination();
        examination.inputExamDetails();
        System.out.println("Examination Details:");
        examination.display();
    }
}
