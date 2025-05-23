
public class ArrayFouth {

    public static void main(String[] args) {
        // S-1-Create an object array with diff. data type

        Object[] mixedArray = {123, "Java", 45.67, true, 'A'};
        // S-2 Conter each element to string,

        for (Object element : mixedArray) {
            String Str = element.toString();
            System.out.println("Convert to string: " + Str);
        }
    }
}

// 1.) object mixedarray = {  } => this create an array that can hold any type of data , since everything in java extends object 
// 2.) elements.toString()   => every class in java inherits the toString() method from the object class 
        // 3.) primitive values like int , boolean etc  , are autobased into their wrapper classes( integer  , Boolean ) , which override to String() to return a readable String form
