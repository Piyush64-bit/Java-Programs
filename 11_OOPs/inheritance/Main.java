// package OOPS.oops3.inheritance;

// public class Main {
//     public static void main(String[] args) {
//         // Creating a BoxPrice object using full constructor
//         BoxPrice item1 = new BoxPrice(2.0, 3.0, 4.0, 5.0, 100.0);
//         System.out.println(item1);
//         // Creating a BoxPrice object using cube constructor
//         BoxPrice item2 = new BoxPrice(5.0, 6.0, 150.0);
//         System.out.println("------");
//         // Creating a copy of BoxPrice object
//         BoxPrice item3 = new BoxPrice(item2);

//         // Using inherited method
//         item3.information();
//     }
// }


// // BoxPrice item1 = new BoxPrice(2.0, 3.0, 4.0, 5.0, 100.0);
// // Calls BoxPrice(double, double, double, double, double)

// // Calls super(l, h, w, weight) in BoxWeight

// // Calls super(l, h, w) in Box

// // Prints: Box class constructor

// // Initializes weight

// // Initializes cost

// // 🔹 BoxPrice item2 = new BoxPrice(5.0, 6.0, 150.0);
// // Calls cube constructor in BoxPrice

// // Calls super(side, weight) → BoxWeight(double, double)

// // Calls super(side, side, side) → Box

// // Initializes weight

// // Initializes cost

// // 🔹 BoxPrice item3 = new BoxPrice(item2);
// // Calls copy constructor in BoxPrice

// // Calls super(other) → BoxWeight(BoxWeight other)

// // Calls super(other) → Box(Box old)

// // Prints: Box Copy class constructor

// // Copies weight

// // Copies cost

// // 🔹 item3.information();
// // Method from base class Box gets called
