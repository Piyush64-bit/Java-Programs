package OOPS.oops2.singleTon.regular;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void showConfig() {
        System.out.println("Showing configuration");
    }
}
// 1. Initialization of the singleton class in this file 