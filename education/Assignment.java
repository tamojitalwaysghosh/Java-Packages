package education;

import java.util.Scanner;

public class Assignment {
    private int assignmentNumber;
    private String assignmentSubject;
    private int marksOnAssignment;

    public void inputAssignmentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Assignment Number: ");
        this.assignmentNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Assignment Subject: ");
        this.assignmentSubject = scanner.nextLine();
        System.out.print("Enter Marks on Assignment: ");
        this.marksOnAssignment = scanner.nextInt();
    }

    public void display() {
        System.out.println("Assignment Number: " + assignmentNumber);
        System.out.println("Assignment Subject: " + assignmentSubject);
        System.out.println("Marks on Assignment: " + marksOnAssignment);
    }
}
