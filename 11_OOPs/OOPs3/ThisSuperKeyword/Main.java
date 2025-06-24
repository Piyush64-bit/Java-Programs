// class Animal {
//     String type = "Animal";

//     Animal(){
//         System.out.println("Animal Constructor called");
//     }
//     void sound(){
//         System.out.println("Animal makes sound");
//     }

// };

// //Now creating a child class of Animal -Dog
// class Dog extends Animal{
//     String type = "Dog";


// Dog(){
//     //super is eleigible because, Dog is a child class of the parent Animal
//     super();
//     System.out.println("Dog contructor called");
// }
//  void showType(){
//     // iska mtlb, dog mei jo ho rha hai uske dekhne ke liye - this keyword use hoga
//     // dog ke parent mei jo ho rha hai usko dekhne ke liye super use hoga
//     System.out.println("Type in Child :"+ this.type);
//       System.out.println("Type in Parent :"+ super.type);
//  }

//  void sound(){
//     super.sound();    // called the parent class sound method
//     System.out.println("Dog barks");
//  }


// };

// public class Main {
//      public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.showType();
//         dog.sound();
//      }
// }