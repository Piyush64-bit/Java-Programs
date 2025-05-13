package first;
// Main.java
public class Main {
    public static void main(String[] args) {
        MyBook b1 = new MyBook("Java Basics", 300);
        MyBook b2 = new MyBook("Advanced Java", 450);
        b1.display();
        b2.display();
    }
}

class MyBook {
    String title;
    int pages;

    public MyBook(String t, int p) {
        title = t;
        pages = p;
    }

    void display() {
        System.out.println("Title: " + title + " | Pages: " + pages);
    }
}
