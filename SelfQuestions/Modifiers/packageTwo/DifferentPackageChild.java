package OOPS.oops6.pACKAEGES.modifiers.packageTwo;

import OOPS.oops6.pACKAEGES.modifiers.packageOne.Base;

public class DifferentPackageChild extends Base {
    public void accessFromDifferentPackageChild() {
        System.out.println("DifferentPackageChild access:");
        System.out.println("public: " + publicVar);
        System.out.println("protected: " + protectedVar); // ✅ inherited access
        // System.out.println("default: " + defaultVar);  // ❌ not allowed
        // System.out.println("private: " + privateVar);  // ❌ not allowed
    }
}
