package OOPS.oops7.interfacess;

import Core.MyEngine;

public class MyPowerEngine implements MyEngine {
     @Override void start(){
       System.out.println("Power engine starts");
     }

     @Override void stop(){
        System.out.println("Power engine stops");
     }
     @Override void acc(){
        System.out.println("Power engine acc");
     }
}

// this is the classic example of  the seperate classes with the same interfaces
