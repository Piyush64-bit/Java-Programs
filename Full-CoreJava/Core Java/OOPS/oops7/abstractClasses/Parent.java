public abstract class Parent{

    int age;
    //creating a final 
    final int VALUE;
  

    public Parent(int age){
        this.age = age;
        VALUE = 25648;
    }

    // creating static method
    static void hello(){
        System.out.println("Hey");
    }
    //creating a normal method
    void normal(){
        System.out.println("This is very normal here");
    }
   abstract void career(String name);
   abstract void partner(String name,int age);
}