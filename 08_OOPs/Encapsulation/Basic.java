// data hiding in java 
// for the purpose of restricting direct access to some of the objects components
// private variables (private) keyword 
// public method (getter / setter)
// why encapsulation 
// 1 data security 
// 2 control
// 3 code maintainability 


// Getter method 
// public String Getname (){
// return name ;
// }  it's the syntax 
//  getter method allows controlled access to a private variable 
// Getter provides " read only " access to the  name variable

// Setter Method -
// this is also a public method  ,  which allowed controlled modification of a parivate  variable 
// this . name = name ;
//       private   parameter

class Person {
    private String name;
    private int age;
    
    // getter method
    public String getName() {
        return name;
    }

    // setter method 
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // setter for age 
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be 0 or negative");
        }
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Basic {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        p.setAge(25);
        p.display();
    }
}