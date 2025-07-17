package OOPS.oops1;

public class Four {
    public static void main(String[] args) {
        //1. Wrapper classes exampls 
        int a = 10;
        int b =20;
        Integer c = 20;
        Integer d = 40;
        //the above one is an primitve one example and a. will not give you much options
        Integer num = 45;
        // on the other hand this Integer now gives you an object which gives lots of propertiews with Integer.
        //>> If i try to swap the primitve values , they wont swap and only pass by reference values swap with each other
         swap(a, b);
         swap2(c, d);
       System.out.println(a+" "+b);

       final A Laksh = new Four.A("Laksh Yadav");
       Laksh.name = "other name";
       
        
    }
    static void swap(int a ,int b){
        int temp = a;
        a =b;
        b=temp;
    }
    // but what if i try with the Integer > thats an referene object right ?? , try with that one too 
    static void swap2(Integer c ,Integer d){
        int temp = c;
        c =d;
        d=temp;
    }
    // In this calse also they wont swap due to the interal working of the final keyword 
    // final Integer c =10, Integer d = 20 , now cant be swapped
    // the thing with the final keyword is always initialize while declaring it
    // the case with the final is you cannot change the value when its primitve data type and for the reference one you can change the data type
    static class A{
        final int num = 10;
        String name;
        public A(String name){
            this.name = name;
        }
    }

}
