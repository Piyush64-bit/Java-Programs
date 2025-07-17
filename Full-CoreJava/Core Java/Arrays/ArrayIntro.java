public class ArrayIntro{
    public static void main(String[] args) {
         //Q-Store a roll no
          int a = 19;
          //q- store a person;s name 
          String name = "Laksh";

          //Q-store 5 roll numbers , store 500 roll numbers
          int rollOne = 23;
          int rollTwo = 12;
          int rollthree = 18;

          //Syntax:
           // datatype [] variable_name = new datatype[size];
           // for storing 5 roll nos now
           int [] rnos = new int[5];
        //    or directly by
           int [] rnos2 = {1,2,3,4,5};
           for (int i=0;i<rnos2.length;i++){
            System.out.println(rnos2[i]);
           }
        // No mix and match of the data types is allowed in the array in java
        // array declaration - int [] ros; >> with this ros is bveing defined in the stack
        // int[] ros = new int[5] >> actually here object is being created in the memory (heap) (initialization)
        // int[] ros {happens at compile time} : new int[5] {happens at run time} (this is called dynamic memory allocation)
        // in java, there's no pointer or something so the java ultimately depends on the jvm for to decide weather elements inside array are continous or not. Now, as per the hava docs we know that -
        // 1. array objects are stored inside the heap 2. heap objects are not continous 3. Dynamic memory allocation (run time) 4.  So, for the conclusion , if you google array objects are the continous data but in java internally, they are not continous depends on the jvm ultimately
        // the new keyword here is used to create an object
        // try to ddeclare an array and print the array - you will get 0 at all the indexes when the array is undefined
        // but in the case of string array > you get null
        //Reason for the null- String is an reference data type in he java . Now, array of string pointing towards indivudal objects in java. So, if nothing is assigned you get null

        String [] arr2 = new String[4];
        System.out.println(arr2[0]);
        System.out.println(rnos[0]);
        System.out.println(rnos[1]);
        System.out.println(rnos[2]);
        System.out.println(rnos[3]);

        System.out.println(rnos2[3]);

    }
}