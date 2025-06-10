public class classTwo {
    public static void main(String[] args) {
        // constructor comes into play
        // constructor - a constructor basically definers what happens when you object is created.
        // a contructor is an special type of function in class, which binds argumenst with the objects.
        // for ex- students johm = new student("Alice", 20);
        // we need on word to access every object. That word will be new approach "this keyword".


        // old approach 
        // students s1() {
        // s1.name = "Rahul";
        // s1.age = 20;
        // s1.marks = 88.804 }

        // new approach
        // students s1() {
        // this.name = "Rahul";
        // this.age = 20;
        // thsi.marks = 88.804 }

        // for the every new object created the 'this' keyword, takes name, age, marks.

        // student s1 = new student("John", 34, 88.45f);
        // student s2 = new student("Hercules", 34, 88.45f);

        //System.out.println(s1.name + " " + s1.age + " " + s1.marks);
        //System.out.println(s2.name + " " + s2.age + " " + s2.marks);

    }
}

// class student {
// string name;
// int age;
// float marks;
//student(string name, int age, float marks) {
//this.name = name;
// this.age = age;
// this.marks = marks;
//}
//}
