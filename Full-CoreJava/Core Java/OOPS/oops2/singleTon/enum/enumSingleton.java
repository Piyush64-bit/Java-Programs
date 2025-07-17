package OOPS.oops2.singleTon.enum;

public enum enumSingleton {
    INSTANCE;

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
