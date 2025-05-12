// package OOPs.CConstructorss;

class Book {
    String title;

    // Constructor to initialize the title
    Book(String t) {
        title = t;
    }

    // Copy constructor
    Book(Book b) {
        title = b.title;
    }

    // Method to display the title
    void display() {
        System.out.println("Title: " + title);
    }
}

public class CCOOPPYY {
    public static void main(String[] args) {
        // Creating original book
        Book b1 = new Book("learn java");
        
        // Creating copies
        Book b2 = new Book(b1);
        Book b3 = new Book(b2);
        Book b4 = new Book(b3);
        
        // Displaying titles
        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}