package OOPS.oops2.singleTon.enum;

public class enumSingletonTwo {
    public static void main(String[] args) {
        enumSingleton logger1 = enumSingleton.INSTANCE;
        enumSingleton logger2 = enumSingleton.INSTANCE;

        logger1.log("System started");
        System.out.println(logger1 == logger2); // true
    }
}
