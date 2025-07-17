package OOPS.oops2.staticTwo;

public class StaticTwo {
         // 1. This is a demo to show the initialization of the static variable 
         static int a = 4;
         static int b;

        //  this static block will only runs once when the first obj is created. i.e. when the class is loaded for the first time 

         static {
            System.out.println("I am in the static block");
            b= a*5;
         }
    public static void main(String[] args) {
       StaticTwo obj = new StaticTwo();
       System.out.println(StaticTwo.a + " "+StaticTwo.b);

       StaticTwo.b +=3;
       StaticTwo obj2 = new StaticTwo();
       System.out.println(StaticTwo.a +" "+StaticTwo.b);
    }
}
