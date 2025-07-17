package OOPS.oops1;

public class Two {
    public static void main(String[] args) {
        //1. That's where the constructor comes into the play
        // 2. Constructor - a constructor basically defines what happens whenr your object is being created.
        // >> In other terms, a constructor is an special type of function in class, which binds arguements with the object
        // >> for ex- Student Laksh = new Student("Laksh Yadav", 13, 64.3)
        // >> we need one word to access every object. that word will be the "this keyword"
        //>> for ex- old apporach
        //  Student rahul(){                                             
        //     rahul.name =12;
        //     rahul.age = "hero";
        //     rahul.marks = 88.5f;
        //  }

          //  Student rahul(){
        //     this.name =12;
        //     this.age = "hero";
        //     this.marks = 88.5f;
        //  }
        // for the every new object created, the this keyword takes the name, age, marks of that 

        Student s1 = new Student("Laksh Yadav", 13, 64.3f);
        Student s2 = new Student("Rahul", 15, 88.5f);

        System.out.println(s1.name + " " + s1.age + " " + s1.marks);
        System.out.println(s2.name + " " + s2.age + " " + s2.marks);
    }
}

class Student {
    String name;
    int age;
    float marks;

    Student(String name, int age, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}
