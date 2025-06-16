// public class staticThree {
//     static void showMessage() {
//         System.out.println("Static method called from Test class!");
//     }

//     // Static nested class
//     static class Test {
//         String name;

//         public Test(String name) {
//             this.name = name;
//         }

//         public void printName() {
//             System.out.println("Name: " + name);
//         }
//     }

  

//     public static void main(String[] args) {
//         // Creating objects of static nested class using outer class name
//         StaticThree.Test a = new StaticThree.Test("Laksh");
//         StaticThree.Test b = new StaticThree.Test("Parv");

//         // Call method to display names
//         a.printName();
//         b.printName();
//         // calling the static method directly
//         StaticThree.showMessage();
//     }
// }

// // Outside classes cannot be static
// // Any inside/ nested classes can be static
// // creating constructor here
