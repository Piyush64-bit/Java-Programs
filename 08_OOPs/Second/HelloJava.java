class Calculator {
   int result = 0;
   
   Calculator add(int val) {
    result += val;
    return this;
   }
   Calculator multiply(int val) {
    result += val;
    return this;
   }
   void show() {
    System.out.println("Result: " + result);
   }
}
public class HelloJava {
   public static void main(String[] args) {
       Calculator c = new Calculator();
       c.add(5).multiply(10).show();
   }
};
