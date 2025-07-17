package OOPS.oops2.staticExample;

public class User {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    // Constructor
    public User(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // this.population+=1;
        User.population+=1;
    }

    // You can optionally add a display method
    public void displayInfo() {
        System.out.println(name + " | Age: " + age + " | Salary: " + salary + " | Married: " + married);
    }
}


// In the User class (or any similar class used to define objects or models), there's no need for a main() method unless you're writing a test or trying to run it independently.

// Import statements are also unnecessary when using classes in the same package, because Java automatically recognizes them within the same package hierarchy.

// those properites that are independent from the objects from which they are being created are called - Static variables  . Now, the population is common to both the objects of the parent class. But, there is a doubt, if the static is independent of the object, why used with the this keyword ?? , instead it should be used with the class
// When the member is decalred static, it can be accessd before any of the objects of the class being created,and without referencing to that object.(ex- laksh.population not needed)
// **Big Conclusion - now imagine of the public static void main (){}, for anything to run inside a class, you need an object created first. Now, with the static keyword, you can run the main method wihout crating any object

// A static method can only access the static data and not the non static data , for ex- void greeting(){syso  - Hello world} - this method belongs to the object
// // That ultimately means, what will be inside the static main(){}, doesnt depends on the objects and all the non static things depends or belongs to the object
static void fun(){
    // greeting();    //cant be called because it requires an instance to call, but the function that you are using it in doesnt requires an object
    // For this, you have to reference it , as
    User obj = new User();
    obj.greeting();
}
 void greeting(){
    System.out.println("Hello");
 }
