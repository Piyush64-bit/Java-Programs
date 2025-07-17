
package OOPS.oops8.lambdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    // Lambda functions are specifically one line functions so, that are inline functions that can represented in a very short form
    // to convert the sum function into a lambda function -
    // S-1- create an arraylist > use the for loop and with that for each 
    // S-2- here item represents the every single element of the array
    // S-3- LHS (arr.foreach) - is containing the parameters and -> RHS containing the body of the function
    // S-4- Consumer here represents an operation that accepts a single input argument and returns no result. This is a functional interface whose functional method is an object.
    // S-5- created a consumer and assigned an operation to it
    // S-6- Lambda expressions can be assigned to variables that are typed interfaces

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1); // adds 1 to 5
        }

        // Lambda in forEach directly
        arr.forEach((item) -> {
            System.out.println(item * 2);
        });

        // Using Consumer Functional Interface
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

        // Lambda expressions for arithmetic operations
        Operation sum = (a, b) -> a + b;
        Operation subtract = (a, b) -> a - b;
        Operation multiply = (a, b) -> a * b;
        Operation divide = (a, b) -> a / b;

        Lambda myCalculator = new Lambda();
        System.out.println(myCalculator.operate(5, 3, sum));
        System.out.println(myCalculator.operate(5, 3, subtract));
        System.out.println(myCalculator.operate(5, 3, multiply));
        System.out.println(myCalculator.operate(5, 3, divide));
    }

    // Custom method that takes two numbers and a lambda operation
    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

// Functional Interface to perform operations
interface Operation {
    int operation(int a, int b);
}


/*
================ EXPLANATION ==================

1. STEP-BY-STEP FLOW:
-----------------------
- We create an ArrayList and populate it with numbers 1 through 5.
- First, we use a lambda expression directly inside `forEach` to print each item multiplied by 2.
- Then, we define a `Consumer<Integer>` lambda and pass it to `forEach` for the same result.
- We define several `Operation` lambda expressions for sum, subtract, multiply, and divide.
- These are passed to a method `operate(int a, int b, Operation op)` which applies the lambda operation and returns the result.
- This demonstrates functional programming using lambdas and functional interfaces.

2. DEFINITIONS & PURPOSE:
----------------------------

- Lambda Expression:
  A short block of code which takes in parameters and returns a value. Used to implement methods of functional interfaces concisely.

- Functional Interface:
  An interface with a single abstract method. Allows lambda expressions to provide implementations for that method.
  (e.g., `Operation`, `Consumer`)

- Consumer<T>:
  A predefined functional interface in `java.util.function` package. It accepts a single input and returns nothing (void).
  Syntax: `Consumer<Integer> c = (item) -> System.out.println(item);`

- Operation Interface:
  Custom functional interface created to perform operations like sum, subtract, etc. Using it allows us to pass operations as arguments.

- forEach():
  A method available for collections like ArrayList to iterate each element. Works well with lambdas.

- Lambda `operate()` method:
  This method demonstrates higher-order functions (passing functions as parameters) in Java.

3. WHY USE THIS APPROACH:
-----------------------------
- Cleaner and more concise code.
- Avoids creating multiple subclasses or anonymous inner classes.
- Promotes use of modern Java features for better readability and modular code.
- Useful for APIs that expect functional interfaces (like `forEach`, `stream`, `map`, etc.)

============================================
*/
