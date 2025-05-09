public class StringObj {
 public static void main(String[] args) {
     String[] students = {"Alice", "Bob", "Marley"};

     for ( String myStudents: students) {
        System.out.println("Students: " + myStudents.toUpperCase());
     }
 }   
}
