class Stud {
   String name;
   int age;

   // calling constructor inside constructor
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

   public class student{
   public static void main(String[] args) {
      Student s1 = new Student();
      Student s2 = new Student("Arjun", 22);

      s1.display();
      s2.display();
   }

};
