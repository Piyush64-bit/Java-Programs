public class Inheritanceone {
    double l;
    double w;
    double h;

        Inheritanceone() {
            this.l = -1;
            this.w = -1;
            this.h = -1;
            // Default Constructor
    }

        Inheritanceone(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
        // Parameterized Constructor
    }

    public Inheritanceone(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
        // Passing all three arguments
    }

    Inheritanceone(Inheritanceone old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
        // Copy Constructor
    }

    public void Information() {
        System.out.println("Running the Box");
    }

}

            // Inheritance, simply defines, inheriting or deriving properties from the parent class by the child class.
            // Any class derived from the base class is the child class.
            // Child class inherits properties(variables, methods etc.) from the baseclass.
            // 'extends' keyword is the bridge b/w base class and the child class
            // Now, the child class has all the properties of the base class + properties of thier own.
            // When defining the constructor, you also need to initialize parent class variable also.

        

        

