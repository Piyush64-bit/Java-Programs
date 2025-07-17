public class Son extends Parent {
    //creating a constructor for receving age
    // first use this as uncomment and then comment it
    // public Son(int age){
    //     this.age = age;
    // }
    public Son(int age){
        super(age);
    }
   @Override
   void career(String name){
        System.out.println("I am going to be a doctor");
   }
   @Override
   void partner(String name,int age){
    System.out.println("I love"+ name+"she is"+ age);
   }
}
