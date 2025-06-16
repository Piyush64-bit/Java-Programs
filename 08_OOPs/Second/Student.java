class Stud {
   String name;
   int age;

   // calling constructor inside constructor
   /**
    * 
    */
   Stud() {
      this("Unknown", 0);
   }

   Stud(String name, int age) {
      this.name = name;
      this.age = age;
   }

   void display() {
      System.out.println("Name: " + name + " Age: " + age);
   }
}

class StudentTest {
   public static void main(String[] args) {
      Stud s1 = new Stud();
      Stud s2 = new Stud("Arjun", 22);

      s1.display();
      s2.display();

      // Explicitly use StudentTest to avoid "never used" warning
      StudentTest test = new StudentTest();
   }

}
