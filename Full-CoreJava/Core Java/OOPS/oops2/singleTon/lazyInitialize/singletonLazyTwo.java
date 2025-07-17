package OOPS.oops2.singleTon.lazyInitialize;

public class singletonLazyTwo {
    public static void main(String[] args) {
        singletonLazy s1 = singletonLazy.getInstance();
        singletonLazy s2 = singletonLazy.getInstance();

        s1.displaySettings();
        System.out.println(s1 == s2); // true
    }
}
