package Strings;

public class StringIntro{
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,19};
        int a = 10;
        String name ="Laksh Yadav";
        System.out.println(name);

        String b = "Laksh";
         b = "Yadav";
         System.out.println(b);
    }
}



// Points to Remember :
// 1. Everything that starts with a capital letter "S" is a class in java
// 2.  When you see the syntax of the string it is : Datatype refernce variable  = string object
// 3. There are important concepts behind working in a string , these are -
    // >>a.} String Pool   b.} Immutablity 
    // a.} Working of the  String Pool - 
        // > String pool is the storage data structure inside the heap memory. It is used to store the string objects. Now, to optimize this data structure , it prevents the entry of duplicate copies into the pool. For ex - String name = "Kunal" , String b = "Kunal" >> now both name and b are pointing towards a single object in the string pool ,i.e. Kunal , no seperate name and b objects. 
        // > now, some of you might doubt that what if i want to change this object, that will affect both the references pointing towards this object. To them, my answer is no, you cant change. Beause, strings are immutable in javva, once assigned a value , to modify ,create a new one.
        // > As i see in line 10, created an string object with b as its reference, now assigned b with a new string - yadav, you will see that the old one is modified and the latest change is preserved. For this, when i wrote b = yadav, then in the string pool , i created another object yadav along side laksh and b is pointing towards both the objects now.
        // > Why we cant modify the string objects ??? Simply, for n number of person string with value as "laksh", now all are pointing towards the laksh object in the string pool, if suppose i try to rename the object for person 2, then all other persons will get affected if no copies or different objects are created. So, for security reasons, its not allowed
        
        