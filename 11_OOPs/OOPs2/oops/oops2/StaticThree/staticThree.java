public class staticThree {
    static class Test {
        String name;
        public Test (String name) {
            this.name = name;
        }
    }
    public static  void main(String[] args) {
        Test a = new Test("Piyush");
        Test b = new Test("Parv");

        System.out.println("a.name = " + a.name);
        System.out.println("b.name = " + b.name);
    }
}

// Outside classes cannot be static
// Any inside/ nested classes can be static
// creating constructor here
