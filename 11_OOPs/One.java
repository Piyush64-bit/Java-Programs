
public class One {

    public static void main(String[] args) {
        // store 5 roll no.
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // now i want a container to store data - names, rollno., marks etc..
        // Your apprache:
        // > Int [] rollno = new int [5];
        // > String [] Studentname = new string [5];
        // > Float [] marks = new float [5]
        // // you have created 3 different objects for 3 different entities, which is not feasible
        // Suppose ,what if i want a data structure in which every single element stores above
        //this is where classes and objects came into java.
        // initializing a class:
        //  Statement []students=new Statement[];
        //   class Student{
        //  int [] roll no.=new int[5];
        // String StudentName=new String[];
        // float[]marks=new float[5];
    }
}


// Classes are just like a template, for ex - car is an template and from that many companies have created so many brands and cars.
// For ex - car can have - seats, engine, prive, this ids an general template every car has.
// Like - Maruti, ferrari, etc...abstract 

// Car template does not exist physically, through you can find cars and models. Tewmplate are like rule of something car brands has to follow while making a car

// -> a class is an template ofg an object.
// -> an object is an instance of an class.

// classes are "logical construction", Objects are -> "Physical Reality"

// For ex - i have created 3 objects of the class 
// -> 3 refence variables and with the (.) operatot, they are linked with the instance variable of the class template


// You will get null whentry to print an empty object.
// System.out.println(students);

// to see something instead of null, we use "new " keyword which dynamically allocates memory at runtime and returns a refrence variable.

// Student student1 = new students();

// Student student1 ==>   Happening at compile time
// -> code is exceuting
// -> errors are shown
// -> Source code -> byte code
// Now, when i do, S1. name, S1. rollno.

// new students(); ==> Happening at run time
// -> after verification java running your code and memory is being allocated
// It checks wheather i have assigned a value and if not, it prints the default value instead.
