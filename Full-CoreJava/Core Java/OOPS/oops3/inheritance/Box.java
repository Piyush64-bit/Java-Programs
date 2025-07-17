package OOPS.oops3.inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(double l, double h, double w){
        System.out.println("Box class constructor");
        this.l = l;
        this.w = w;
        this.h=h;
    }
    Box(Box old){
        System.out.println("Box Copy class constructor");
        this.l = old.l;
        this.w = old.w;
        this.h=old.h;   
    }
    public void information(){
        System.out.println("Running the box");
    }
    public static void main(String[] args) {
        //Types of inheritance in the java 
         //1. Single Inheritance
         //2. Multilevel inheritance
           //> Multiple parent classes for their respective child in a chain order.
           //>> Thumb rule to understand java is try this and that , not relying on sir to teach
          //>> in multilevel inheritance, above classes have no idea of their childs but the childs have complete idea of their parents  
          
          
//  Base class with l, h, w (length, height, width).

// Two constructors:

// One takes values directly.

// One is a copy constructor.

// information() is a sample method.

    }
}
