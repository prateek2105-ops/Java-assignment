public class BookLoan {

    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "Rahul", "B101");
        Book b2 = new Book("Data Structures", "Aman", "B102");

        System.out.println(b1);

        System.out.println("Borrow b1: " + b1.borrowBook());

        System.out.println("Borrow b1 again: " + b1.borrowBook());

        System.out.println("Return b1: " + b1.returnBook());

        System.out.println("Return b1 again: " + b1.returnBook());

        System.out.println();

        System.out.println("Book 1: " + b1);
        System.out.println("Book 2: " + b2);

        b2.borrowBook();

        System.out.println();

        System.out.println("After borrowing Book 2:");
        System.out.println("Book 1: " + b1);
        System.out.println("Book 2: " + b2);

        System.out.println();

        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Book Code: " + b1.getBookCode());
        System.out.println("Available: " + b1.isAvailable());
    }
}
