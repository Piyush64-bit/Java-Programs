// package OOPS.oops3.inheritance;

// public class BoxWeight extends Box {
//     double weight;

//     public BoxWeight(){
//         super(-1, -1, -1); // Call a valid Box constructor with default values
//         this.weight = -1;
//     }

//     BoxWeight(BoxWeight other){
//         super(other);  // Call to Box copy constructor
//         weight = other.weight;
//     }

//     //creating  the constructor for the side 
//     BoxWeight(double side, double weight){
//         super(side, side, side);  // Added missing part (perfect cube)
//         this.weight = weight;
//     }

//     public BoxWeight(double l, double h, double w, double weight){
//         //used to initilaize the values present in the parent class
//         super(l, h, w); // What is this ?? - calling the parent class constructor
//         this.weight = weight;
//     }
// }

// // Inherits from Box, adds weight.

// // Has:

// // Default constructor

// // Copy constructor (calls super(other) → Box's copy constructor)

// // Cube constructor (side)

// // Full constructor with all dimensions and weight

// // Uses super(...) to call parent constructors.
