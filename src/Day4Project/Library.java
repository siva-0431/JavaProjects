package Day4Project;

public class Library{

    Book[] books = new Book[100];
    int count = 0;

    public void addBook(Book book) {
        books[count] = book;
        count++;
        System.out.println("Book Added Successfully.");
    }

    public void viewBooks() {

        if (count == 0) {
            System.out.println("No Books Available.");
            return;
        }

        for (int i = 0; i < count; i++) {

            Book b = books[i];

            System.out.println("----------------------------");
            System.out.println("Book ID : " + b.getBookId());
            System.out.println("Book Name : " + b.getBookName());
            System.out.println("Author : " + b.getAuthorName());
            System.out.println("Issued : " + b.isIssued());
        }
    }

    public void searchBook(int id) {

        for (int i = 0; i < count; i++) {

            if (books[i].getBookId() == id) {

                System.out.println("Book Found");
                System.out.println("Book Name : " + books[i].getBookName());
                System.out.println("Author : " + books[i].getAuthorName());
                System.out.println("Issued : " + books[i].isIssued());
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public void issueBook(int id) {

        for (int i = 0; i < count; i++) {

            if (books[i].getBookId() == id) {

                if (!books[i].isIssued()) {

                    books[i].setIssued(true);
                    System.out.println("Book Issued Successfully.");

                } else {

                    System.out.println("Book Already Issued.");
                }

                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public void returnBook(int id) {

        for (int i = 0; i < count; i++) {

            if (books[i].getBookId() == id) {

                if (books[i].isIssued()) {

                    books[i].setIssued(false);
                    System.out.println("Book Returned Successfully.");

                } else {

                    System.out.println("Book Already Available.");
                }

                return;
            }
        }

        System.out.println("Book Not Found.");
    }

}
