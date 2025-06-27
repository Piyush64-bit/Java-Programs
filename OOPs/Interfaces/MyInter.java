// First Interface 
interface Printable{
    void print();
    // it is an abstract method by default
}

//Second Interface
interface Showable{
    void show();
}

//Third interface
interface PhotoCopy{
    void photo();
}
//Class implementing multiple interfaces 
class Document implements Printable, Showable, PhotoCopy{
    @Override
    public void print(){
        System.out.println("Printing documents...");
    }

    @Override
    public void show(){
        System.out.println("Showing document...");
    }
    @Override
    public void photo(){
        System.out.println("Bhaiya ek photo copy dena");
    }
}

public class MyInter{
    public static void main(String[] args) {
        Document mydoc = new Document();
        mydoc.print();
        mydoc.show();
        mydoc.photo();
    }
}