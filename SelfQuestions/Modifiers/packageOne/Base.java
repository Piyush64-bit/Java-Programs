package OOPS.oops6.pACKAEGES.modifiers.packageOne;




public class Base {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3; // package-private
    private int privateVar = 4;

    public void showAccess() {
        System.out.println("Base class access:");
        System.out.println("public: " + publicVar);
        System.out.println("protected: " + protectedVar);
        System.out.println("default: " + defaultVar);
        System.out.println("private: " + privateVar);
    }
}
 
    

