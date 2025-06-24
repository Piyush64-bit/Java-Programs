// public class ClassFour {
//     public static void main(String[] args) {
//         // wrapper class examples 
//         int a = 10;
//         int b = 20;
//         Integer c = 30;
//         Integer d = 40;

//         // the above one is a primitive example and it will not give you much options.
//         // for the Integer now gives you an object which gives lots of properties with integers.
//         // if I try to swap the primitive values, they won't swap; only pass by reference values swap with each other.

//         swap(a, b);
//         swap2(c, d);

//         System.out.println(a + " " + b);

//         final A John = new ClassFour.A("John Doe");
//         John.name = "other name";
//     }

//     static void swap(int a, int b) {
//         int temp = a;
//         a = b;
//         b = temp;
//     }

//     static void swap2(Integer c, Integer d) {
//         int temp = c;
//         c = d;
//         d = temp;
//         // In this case also they won't swap due to Java's pass-by-value semantics.
//     }

//     static class A {
//         final int num = 10;
//         String name;
//         public A(String name) {
//             this.name = name;
//         }
//     }
// }

// // the case with the finalis your cannot change the value, when its primitive data types and foer the reference one you can change the datatype.
