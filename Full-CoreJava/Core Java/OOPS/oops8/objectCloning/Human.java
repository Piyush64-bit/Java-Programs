package OOPS.oops8.objectCloning;

public class Human implements Cloneable {
    int age;
    String name;

    //creating the normal constructor here
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    //creating the copy constructor here
    public Human(Human other){
        this.age = other.age;
        this.name = other.name;
    }

    // for cloning, writing the piece of code here 
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //whatever you are trying to clone throwws some exception and you have to specifically mention that above
        return super.clone();
    }

    //creating the Main.java file now
}
