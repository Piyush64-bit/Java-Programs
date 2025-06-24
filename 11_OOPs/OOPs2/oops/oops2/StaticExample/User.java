// public class User {
//     int age;
//     String name;
//     int salary;
//     boolean married;
//     static long population;

//     public User(int age, String name, int salary, boolean married) {
//         this.age = age;
//         this.name = name;
//         this.salary = salary;
//         this.married = married;
//         User.population += 1; 

//     }

//     public void displayInfo() {
//         System.out.println(name + " | Age: " + age + " | Salary: " + salary + " | Married: " + married);
//     }
// }


// // In this user class, there's no need for a main() method unless you're writing a test or trying it independently.
// // Import statments are also unessary when using classes in the same packeage.
// // It is because java automatically recognize then within the package heiriacy.
// // Those properties which are independent from the objects from which they are created are called -- stataic variables.
// // Population is common to both the objects of the parent class. but, there's a doubt?
// // If "static" is independent of the object, then why used this keyword??
// // = It should be used with the class insted.
