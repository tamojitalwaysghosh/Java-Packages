package education;

import java.util.Scanner;

public class Examination {
    private String subject;
    private int marks;

    public void inputExamDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Subject: ");
        this.subject = scanner.nextLine();
        System.out.print("Enter Marks: ");
        this.marks = scanner.nextInt();
    }

    public void display() {
        System.out.println("Subject: " + subject);
        System.out.println("Marks: " + marks);
    }
}
