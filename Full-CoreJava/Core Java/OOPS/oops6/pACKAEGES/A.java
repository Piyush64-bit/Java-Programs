package OOPS.oops6.pACKAEGES;

public class A {
    int num;
    String name;
    int[] arr;

    private int num2;
    //declaring a private variable here
    //for acessing the private variables we have getter and setter methods in java
    // getter gets the value and setter sets the value 
    public int getNum(){
        return num2;
    }

    public void setNum(int num){
        this.num = num2;
    }
    //calling both the methods inside the main

    public A (int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    
}
