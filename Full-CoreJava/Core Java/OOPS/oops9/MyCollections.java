package OOPS.oops9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MyCollections {
    //Collections framework in java is helping us providing a single interface which includes the common crud methods which all the other dataStructures have like - Maps, Trees ,Queues etc. like the crud operations or something.
    //There are two major interfacecs in the JAVA - one is the collections framework and other one is the Maps
    //Also draw the diagram of the flowchart
    //collections are alreaddy present in the java.util package
    // Simply  aise smjho- ArrayList, StringBuilder etc, mei jo add, remove, edit ke methods hote hai woh common hote hai , so java was like - let me put all the common things inside an interface.
    //For ex- List extends the Collection >> simply means the methodds in the list are also contained in the Collections , so to utlize them  
    //  see list.add or list2.add > both have common methods , thats the beauty 
    // Now, ArrayList and Vector what is the key difference between both of them >> in arraylist, multiple threads in the java can access the array object easily,  but in the case of the vector, if one thread has the access , the second one has to wait in line to finish the 

    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        List <Integer> list2 = new LinkedList<>();
        list.add(34);
        list2.add(84);
        list.add(56);
        list2.add(76);

        System.out.println(list2);
        //creating a vector to demonstrate - they are not as fast as the arralist
        List <Integer> vector = new Vector<>();
        vector.add(5); 
        vector.add(10); 
        vector.add(15); 
    }
}
