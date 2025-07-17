package OOPS.oops1;

import java.beans.Statement;
import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        //store 5 roll numbers
        int [] numbers = new int[5];

        //store 5 names 
        String [] names = new String[5];
        // 1. Now i want a container to store data - rolno, marks, name 
        //>> Now, what is the wrong approach you will be doing -
         int [] rollno =  new int[5];
         String [] studentNames = new String[5];
         float [] marks = new float[5];
        //>> you have created different objects for all the different entities which is not feasible
        //>> suppose , what if i want to a data structure in which every single element stores the above (rol,name,marks) . This is where the classes and objects come into the picture
        //>> One thing is clear from now, if you want to create your own datatype  classes are the way.
        // ==============================================================================================
        // 2. Now initializing a class 
        Statement[] students = new Statement[5];
        class Student{
            int [] rollno =  new int[5];
            String [] studentNames = new String[5];
            float [] marks = new float[5];
        }

        // >> Classes are just like an template, for ex- car is an template and from that many companies have created so many brands and cars.
        // >> for ex- a car can have - seates, engine, price and this is an general template  every car has. Like maruti, ferrari, toyotoa etc.
        // Car templates does not exists physically, though you can find cars and models . the templates are like rule of something car brands has to follow while making a car
        // By this "1. a class is an template of an object" , "2. an object is an instance of an class"
        // Classes are just the logical construct , objects are the physical reality
        // For ex - i have created 3 objects of the class, then those 3 objects have 3 reference variables and with the help of the (.) operator, the reference is linked with the instance variable of the class template
        // 3. You will get null when try to print the  empty object
        System.out.println(Arrays.toString(students));
        // >> to see something instead of null , we use new keyword which dynamically allocates memory at run time and returns a reference variable to it.
        // Student student1 = new Student(); , on LHS 0 it is happening at the compile time(code is exceuting, errors are shown, source code conversion to byte code) , on the RHS it is happening at compile time, means after code verification by jvm it is actuslly running and now the memory is being allocated.
        //  Now, when i do s1.name,s1.roll => it checks weather i have assigned a value and if not it prints the default value instead.
        // Now, one thing is for sure, there should be a way where all the properties can be assigned in a single line, here laksh.name , laksh.roll, laksh.email,...100 properties i have to write so much





        
    }
}
