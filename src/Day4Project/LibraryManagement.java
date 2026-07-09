package Day4Project;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        while (true) {

            System.out.println("\n===== Library Management System =====");

            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Book ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Book Name : ");
                    String name = sc.nextLine();

                    System.out.print("Author Name : ");
                    String author = sc.nextLine();

                    Book book = new Book(id, name, author);

                    library.addBook(book);

                    break;

                case 2:

                    library.viewBooks();

                    break;

                case 3:

                    System.out.print("Enter Book ID : ");
                    int searchId = sc.nextInt();

                    library.searchBook(searchId);

                    break;

                case 4:

                    System.out.print("Enter Book ID : ");
                    int issueId = sc.nextInt();

                    library.issueBook(issueId);

                    break;

                case 5:

                    System.out.print("Enter Book ID : ");
                    int returnId = sc.nextInt();

                    library.returnBook(returnId);

                    break;

                case 6:

                    System.out.println("Thank You.");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }

        }
    }
}