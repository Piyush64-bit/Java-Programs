package OOPS.oops7.interfacess;

import Core.MyMedia;

public class MyCDPlayer implements MyMedia {

    @Override
    public void start(){
        System.out.println("Music Start");
    }

    @Override
    public void stop(){
        System.out.println("Music Stop");
    }
    public static void main(String[] args) {
        
    }
}
