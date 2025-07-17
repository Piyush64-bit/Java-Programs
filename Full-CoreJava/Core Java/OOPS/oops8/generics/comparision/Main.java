package OOPS.oops8.generics.comparision;

import OOPS.oops8.generics.GenericInterface;

public class Main  implements   GenericInterface<Integer>{
    public static void main(String[] args) {
        Student laksh = new Student(12,89.76f);
        Student rahul = new Student(13,99.76f);
        //in the main, created 2 different objects with 2 parameters 
        // Now, if you try the below, java gets confused that marks and roll no  has to compare or what ??
        //For this we uses generic interfaces

        // if(rahul<laksh){
        //     System.out.println("Rahul has more marks");
        // }
    }
}
