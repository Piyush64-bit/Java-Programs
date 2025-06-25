package OOPS.oops6.pACKAEGES.modifiers;

import OOPS.oops6.pACKAEGES.modifiers.packageOne.Base;

public class OutsideWorld {
    public void accessFromOutsideWorld() {
        Base obj = new Base();
        System.out.println("OutsideWorld access:");
        System.out.println("public: " + obj.publicVar);
        // System.out.println("protected: " + obj.protectedVar); // ❌
        // System.out.println("default: " + obj.defaultVar);     // ❌
        // System.out.println("private: " + obj.privateVar);     // ❌
    }
    };