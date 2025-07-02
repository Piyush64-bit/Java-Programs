package mini;

import SelfQuestions.PublicPrivate.Car;

public class MyMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.acc();
        myCar.start();
        myCar.stop();
    }
}

// the major difference  etween a class and interface is varibales in the interface are only static and final nothing else . while a java interface can be created using "impliment" keyword while java classes are created using "entends " keywords
