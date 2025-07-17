package OOPS.oops6.pACKAEGES;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A (34, "Laksh");
        //need to do a few things 
        //1. access the data members
        //2. modify the data members 

        ArrayList<Integer> list = new ArrayList<>(23);
        // list.DEFAULT_CAPACITY ;
        /// shows an error because, behind thescenes this method is private , and it is set to 10, you cant acess it
        /// // we cant access the reference of an array
        /// 
        obj.getNum();
        obj.setNum(15);
    }
}
