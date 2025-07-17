package OOPS.oops3.publicPrivate;

public class Dog extends Animal {
    
    public void bark() {
        // System.out.println("Name: " + name); // ❌ Error: 'name' is private in Animal
        System.out.println("Dog is barking...");
        System.out.println("Age from Animal class: " + age); // ✅ public: accessible here
    }

    public void testPrivateAccess() {
        // secretMethod(); // ❌ Error: can't access private method from Animal
        callPrivateMethod(); // ✅ Okay: call public method that calls private method
    }
}

// 1. There are many variables in both parent and child classes 
// 2. you are given access  to variables  that are in the ref type  i.e. Animal
// 3. hence , you should have access to all the variables except the private
//4. this also means that the ones you are trying to access should also be initialized
//5.  but when the obj is iteself is of the type parent class, then how will you call the constructor of child class
// 6. that means that, parent class ko nahi pta child class mei kitne naye variables aa gye hai, but child ko pta hai ki uske parent mei kya hau and khud mei kya hai
//7.  a child reference object with a parent variable is not allowed in java
  

