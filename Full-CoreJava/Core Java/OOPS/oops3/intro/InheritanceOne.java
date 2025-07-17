package OOPS.oops3.intro;

import javax.swing.Box;

public class InheritanceOne {
    double l;
    double w;
    double h;
    InheritanceOne(){
        this.l =-1;
        this.w=-1;
        this.h=-1;
    }
    //cube
    InheritanceOne(double side){
        this.w = side;
        this.l= side;
        this.h=side;
    }
    // passing three arguements
    public InheritanceOne(double l,double h,double w){
        this.l =l;
        this.w=w;
        this.h=h;
    }

InheritanceOne(InheritanceOne old){
    this.h = old.h;
    this.l = old.l;
    this.w = old.w;
}
 public void information(){
    System.out.println("Running the box");
 }

    public static void main(String[] args) {
        // 1/ Ineritance simply defines inheriting or deriving the properties from the parent to by the child class
        // 2. If there's a class which is the base class  and any class dervided from base class is the child class.Child class inherits properties (variables, methods etc.) from the base class
        //3. "extends" keyword is the bridge between the base class and the child class
        //4.  Now, the child class has all the properties of the base class + the properties of its own
        //5. When defining the constructor , you also need to initliaze the parent class variables also
        //6. 
       

    }
}
