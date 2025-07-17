package Core

import Core.MyBrake;
import Core.MyEngine;

Java.OOPS.oops7.interfacess;

public class MyCar implements MyEngine ,MyBrake {
   @Override
   public void brake(){
      System.out.println("I brake like a normal car");
   };

   @Override
   public void start(){
    System.out.println("I start like a normal car");
   };

   @Override
   public void stop(){
    System.out.println("I stop like a normal car");
   };

   @Override
   public void acc(){
    System.out.println("I accclearates like a normal car");
   };
   
   
} 
