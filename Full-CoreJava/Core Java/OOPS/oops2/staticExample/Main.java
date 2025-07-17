package OOPS.oops2.staticExample;

public class Main {
    public static void main(String[] args) {
        User laksh = new User(22, "Laksh", 30000, false);
        User rahul = new User(21, "Rahul", 10000, true);

        System.out.println(laksh.name);        // Output: Laksh
        rahul.displayInfo();    
        // System.out.println(laksh.population);
        // System.out.println(rahul.population);      
            //   Not a good convention to use for the static one, instead using 
            System.out.println(User.population); 
            System.out.println(User.population); 
            System.out.println(User.population); 
    }
}
