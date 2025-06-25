package OOPS.oops6.pACKAEGES.modifiers;

import OOPS.oops6.pACKAEGES.modifiers.packageOne.Base;
import OOPS.oops6.pACKAEGES.modifiers.packageOne.SamePackageChild;
import OOPS.oops6.pACKAEGES.modifiers.packageTwo.DifferentPackageChild;

public class Main {
    public static void main(String[] args) {
        Base base = new Base();
        base.showAccess();
        System.out.println("----------");

        SamePackageChild spc = new SamePackageChild();
        spc.accessFromSamePackageChild();
        System.out.println("----------");

        DifferentPackageChild dpc = new DifferentPackageChild();
        dpc.accessFromDifferentPackageChild();
        System.out.println("----------");

        OutsideWorld world = new OutsideWorld();
        world.accessFromOutsideWorld();
    }
}

