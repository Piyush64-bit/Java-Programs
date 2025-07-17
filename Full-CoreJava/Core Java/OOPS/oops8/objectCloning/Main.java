package OOPS.oops8.objectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Laksh = new Human(34,"Laksh Yadav");
        //first one calls the normal constructor and second one calls the copy constructor in which in param we have to pass the first object for the copy
        // in java , there;s an interface that is called clonable which we have to use for , that will be implementated in the Human .java file
        // Human twin = new Human(Laksh);
        //first do the above and then comment it and then , if you do the below, on the clone keyword you will get the error and to resolve that "CloneNotSupportedException" you need to sepcivially mention the exceotion
        Human twin = (Human) Laksh.clone();
        System.out.println(twin.age + " "+ twin.name);
        //clone will actually copy the value from one object to the other object
        //lastly add the implements Clonable in the Human.java file >>> why to add this ?? its just the way to tell the jvm that we are just performing clone on the object of the type Human
       
    }
    //To make your cloning code run properly, you need to implement the Cloneable interface in your Human class. Without this, super.clone() will throw a CloneNotSupportedException, even if you handle it with throws.
}
