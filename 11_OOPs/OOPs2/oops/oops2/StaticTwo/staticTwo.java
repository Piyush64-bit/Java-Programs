// public class staticTwo {
//     static int a = 4;
//     static int b;
//     // this is how, we initialize static variables.

//     static {
//         System.out.println("I am the static block");
//         // this block will only reuns when the 1st object is created or when the class is loaded for the 1st time.
//         b = a * 5;
//     }
// public static void main (String [] args) {
//     staticTwo obj = new staticTwo();
//     System.out.println(staticTwo.a + " " + staticTwo.b);
//     staticTwo.b += 3;
//     staticTwo obj2 = new staticTwo();
//     System.out.println(staticTwo.a + " " + staticTwo.b);
// }
// }
