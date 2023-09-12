package admission;

import java.util.Scanner;

public class StudentDetails {
    private String studentName;
    private String department;
    private String dateOfBirth;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        this.studentName = scanner.nextLine();
        System.out.print("Enter Department: ");
        this.department = scanner.nextLine();
        System.out.print("Enter Date of Birth: ");
        this.dateOfBirth = scanner.nextLine();
    }

    public void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}
