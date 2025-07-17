package OOPS.oops2.staticThree;

public class StaticThree {
    // 1. outside classes cannot be static
    // 2. only the inside classes can be static

    static class Test{
        String name;
        // creating the constructor here
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Laksh");
        Test b = new Test("Rahul");
        // because the test class itself depends on its outside classes so the error .
        // now, use the keyword static ahead of the test
    }
}
