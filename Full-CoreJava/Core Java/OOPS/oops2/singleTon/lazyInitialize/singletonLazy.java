package OOPS.oops2.singleTon.lazyInitialize;

public class singletonLazy {
    private static singletonLazy instance;

    private singletonLazy() {
        System.out.println("Settings instance created");
    }

    public static singletonLazy getInstance() {
        if (instance == null) {
            instance = new singletonLazy();
        }
        return instance;
    }

    public void displaySettings() {
        System.out.println("Displaying user settings...");
    }
}
    

