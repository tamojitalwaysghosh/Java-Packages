package admission;

import java.util.Scanner;

public class Library {
    private String bookName;
    private String issueDate;

    public void inputBookDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        this.bookName = scanner.nextLine();
        System.out.print("Enter Issue Date: ");
        this.issueDate = scanner.nextLine();
    }

    public void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Issue Date: " + issueDate);
    }
}
