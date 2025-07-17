package OOPS.oops2.singleTon.regular;

public class SingletonTwo {
    public static void main(String[] args) {
        Singleton config1 = Singleton.getInstance();
        Singleton config2 = Singleton.getInstance();

        config1.showConfig();

        System.out.println(config1 == config2); // true
    }
}
