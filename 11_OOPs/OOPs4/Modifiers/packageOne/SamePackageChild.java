package OOPS.oops6.pACKAEGES.modifiers.packageOne;

public class SamePackageChild extends Base {
    public void accessFromSamePackageChild() {
        System.out.println("SamePackageChild access:");
        System.out.println("public: " + publicVar);
        System.out.println("protected: " + protectedVar);
        System.out.println("default: " + defaultVar);  // ✅ allowed (same package)
        // System.out.println("private: " + privateVar); // ❌ not allowed
    }
}

