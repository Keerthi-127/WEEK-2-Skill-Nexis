import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        // Adding books
        library.addBook(
            new Book(101, "Java Programming", "James Gosling")
        );

        library.addBook(
            new Book(102, "Clean Code", "Robert Martin")
        );

        library.addBook(
            new Book(103, "Data Structures", "Mark Allen")
        );

        // Creating user
        User user = new User(1, "Keerthi");

        System.out.println("\n===== USER DETAILS =====");
        user.displayUser();

        int choice;

        do {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    library.displayBooks();
                    break;

                case 2:
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = sc.nextInt();

                    library.borrowBook(borrowId);
                    break;

                case 3:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    library.returnBook(returnId);
                    break;

                case 4:
                    System.out.println("Thank you for using the Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
