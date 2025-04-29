public class ScopeDemo {
    static int classcount = 0;
    int instancevalue = 10;

    public static void main(String[] args) {
        int localvar = 5;

        System.out.println("Local: " + localvar);
        System.out.println("Static: " + classcount);

        ScopeDemo obj = new ScopeDemo();
        System.out.println("Instance: " + obj.instancevalue);

    }
}